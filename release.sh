#!/bin/bash

VERSION=$(grep version pom.xml | head -1 | sed 's/\s<version>//g' | sed 's/<\/version>//g')
NEW_VERSION=$(echo $VERSION | perl -pe 's/^(\d+\.)(\d+\.)(\d+)$/$1.$2.($3+1)/e')

echo "releasing version $VERSION" 
git tag v$VERSION
git push origin --tag

echo "setting up next version $NEW_VERSION"

REPLACE_PATTERN=$(echo s/$VERSION/$NEW_VERSION/g | sed 's/\./\\\./g')

find . -type f -name "*pom.xml" -exec sed -i "$REPLACE_PATTERN" {} +
find . -type f -name "*feature.xml" -exec sed -i "$REPLACE_PATTERN" {} +
find . -type f -name "*MANIFEST.MF" -exec sed -i "$REPLACE_PATTERN" {} +

git add .
git commit -m "updating version to $NEW_VERSION"
git push origin master
