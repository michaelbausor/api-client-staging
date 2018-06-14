#!/bin/bash

set -e

DATETAG=$(date '+%Y%m%d-%H%M%S')
docker pull googleapis/artman:latest
docker build --no-cache -t googleapis/artman:autobuild-latest .
docker tag googleapis/artman:autobuild-latest googleapis/artman:autobuild-$DATETAG
