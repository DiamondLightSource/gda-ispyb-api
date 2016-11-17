#!/bin/bash

VERSION="grep version pom.xml | head -1 | sed 's/\s<version>//g' | sed 's/<\/version>//g'"
NEW_VERSION=$(echo $VERSION | perl -pe 's/^(\d+\.)(\d+\.)(\d+)$/$1.$2.($3+1)/e')

echo "releasing version $VERSION" 
git tag VERSION
git push --tag

echo "setting up next version $NEW_VERSION"

find . -type f -name "*pom.xml" -exec sed -i 's/1.0.1/1.0.2/g' {} +
find . -type f -name "*feature.xml" -exec sed -i 's/1.0.1/1.0.2/g' {} +
find . -type f -name "*MANIFEST.MF" -exec sed -i 's/1.0.1/1.0.2/g' {} +


