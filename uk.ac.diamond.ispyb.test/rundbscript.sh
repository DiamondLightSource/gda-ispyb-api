#!/bin/bash

if [ $# -eq 5 ] 
   then 
       mysql -h $1 -u$2 -p$3 $4 < $5
fi

if [ $# -eq 4 ] 
   then 
       mysql -h $1 -u$2 $3 < $4
fi

