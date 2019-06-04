#!/bin/bash
echo " *** Executing initial shell script for Tomcat container (at build time) *** "
echo DEPLOY PROFILE : $1
replace_str=$1
replace_str=`echo "$1" | tr '[:upper:]' '[:lower:]'`
sed -i "s/NOETIC_PROFILE/$replace_str/g" /etc/filebeat/filebeat.yml
