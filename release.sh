#!/bin/bash

BRANCH=$(git branch --show-current)
if [[ $BRANCH != "master" ]]; then
    echo "You must be on the master branch to release"
    exit 1
fi

VERSION=$(grep \<version pom.xml | head -1 | sed 's/\s*<version>//g' | sed 's/<\/version>//g')

if [[ $1 = "major" ]]; then 
    NEW_VERSION=$(echo $VERSION | perl -pe 's/^(\d+)\.(\d+)\.(\d+)$/"${\($1+1)}.0.0"/e')
elif [[ $1 = "minor" ]]; then
    NEW_VERSION=$(echo $VERSION | perl -pe 's/^(\d+)\.(\d+)\.(\d+)$/"$1.${\($2+1)}.0"/e')
elif [[ $1 = "bugfix" ]]; then 
    NEW_VERSION=$(echo $VERSION | perl -pe 's/^(\d+)\.(\d+)\.(\d+)$/"$1.$2.${\($3+1)}"/e')
else
    echo "Usage: ./release.sh (major|minor|bugfix)"
    exit 1
fi

echo "Setting up next version $NEW_VERSION"

REPLACE_PATTERN=$(echo s/$VERSION/$NEW_VERSION/g | sed 's/\./\\\./g')

sed -i "$REPLACE_PATTERN" pom.xml

git commit pom.xml -m "Bumping to version $NEW_VERSION"
git push origin master

echo "Creating tag v$NEW_VERSION"
git tag -a v$NEW_VERSION -m "Release of $NEW_VERSION"
git push origin v$NEW_VERSION

echo "The Github release will be made against the tag by the Azure pipeline"
