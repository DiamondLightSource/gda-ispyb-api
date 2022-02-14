#!/bin/bash

version=1.29.0
fname=ispyb-database-${version}.tar.gz

cd target/test-classes

if [ \( ! -d "schemas" \) -o \( ! -f ${fname} \)  ]; then
    wget https://github.com/DiamondLightSource/ispyb-database/releases/download/v${version}/${fname}
    tar xfz ${fname}
fi
