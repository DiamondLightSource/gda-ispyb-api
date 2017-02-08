#!/bin/bash

# with password
if [ $# -eq 6 ] 
   then 
       echo "mysql -h $1 -u$2 -p$3 -P $4 $5 < $6"
       mysql -h $1 -u$2 -p$3 -P $4 $5 < $6
fi

# without password
if [ $# -eq 5 ] 
   then 
       echo "mysql -h $1 -u$2 -P $3 $4 < $5"
       mysql -h $1 -u$2 -P $3 $4 < $5
fi

