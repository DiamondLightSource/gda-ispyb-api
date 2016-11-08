#!/bin/bash
mysql -h $1 -u$2 -p$3 $4 < $5
