#!/bin/bash

set -e

if [ -z "$AUTOBUILD_GH_OAUTH_TOKEN" ]; then
  echo "Need to set AUTOBUILD_GH_OAUTH_TOKEN"
  exit 1
fi

docker run --env GH_OAUTH_TOKEN=$AUTOBUILD_GH_OAUTH_TOKEN googleapis/artman-autobuild:latest $1