#!/bin/bash

version=1.6.0
fname=ispyb-database-${version}.tar.gz

cd target/test-classes

if [ ! -d "schema" ]; then
  if [ ! -f ${fname} ]; then
    wget https://github.com/DiamondLightSource/ispyb-database/releases/download/v${version}/${fname}
    tar xfz ${fname}
  fi
fi
