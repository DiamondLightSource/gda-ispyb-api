#!/bin/bash

VERSION=$(grep version pom.xml | head -1 | sed 's/\s<version>//g' | sed 's/<\/version>//g')

if [[ $1 = "major" ]]; then 
    NEW_VERSION=$(echo $VERSION | perl -pe 's/^(\d+)\.(\d+)\.(\d+)$/"${\($1+1)}.0.0"/e')
elif [[ $1 = "minor" ]]; then
    NEW_VERSION=$(echo $VERSION | perl -pe 's/^(\d+)\.(\d+)\.(\d+)$/"$1.${\($2+1)}.0"/e')
elif [[ $1 = "bugfix" ]]; then 
    NEW_VERSION=$(echo $VERSION | perl -pe 's/^(\d+)\.(\d+)\.(\d+)$/"$1.$2.${\($3+1)}"/e')
else
    echo "usage: ./release (major|minor|bugfix)"
    exit 1
fi

echo "setting up next version $NEW_VERSION"

REPLACE_PATTERN=$(echo s/$VERSION/$NEW_VERSION/g | sed 's/\./\\\./g')

find . -type f -name "*pom.xml" -exec sed -i "$REPLACE_PATTERN" {} +
find . -type f -name "*feature.xml" -exec sed -i "$REPLACE_PATTERN" {} +
find . -type f -name "*MANIFEST.MF" -exec sed -i "$REPLACE_PATTERN" {} +

git checkout -b $NEW_VERSION
git add .
git commit -m "updating version to $NEW_VERSION"

echo "releasing version $NEW_VERSION" 
git tag v$NEW_VERSION
git push origin $NEW_VERSION --tag

echo "you currently need to manually merge back into master"
