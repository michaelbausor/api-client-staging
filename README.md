Staging repository nightly build branch
=================================================

Introduction
------------

This repository is for staging and testing generated client libraries.
This branch contains scripts that will build client libraries and commit
them to api-client-staging.


Usage
-----

Check out this branch, and then run the commands below.

```bash
$ ./dev/sh/docker-build.sh
$ ./dev/sh/run.sh php
```

WARNING: this may take a long time, and the run.sh script
currently cannot be interrupted by ctrl+c
