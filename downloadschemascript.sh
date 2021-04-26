#!/bin/bash

version=1.20.1
fname=ispyb-database-${version}.tar.gz

cd target/test-classes

if [ \( ! -d "schema" \) -o \( ! -f ${fname} \)  ]; then
    wget https://github.com/DiamondLightSource/ispyb-database/releases/download/v${version}/${fname}
    tar xfz ${fname}
fi
