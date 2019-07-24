#!/usr/bin/env bash

dt=$(date '+%d-%m-%Y_%H:%M:%S');

zip -r -j advisor-builds/python-$dt.zip advisor/*

echo "Successfully built python-$dt.zip"
