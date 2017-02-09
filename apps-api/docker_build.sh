#!/usr/bin/env bash
wget https://github.com/DICE-UNC/irods-cloud-browser/releases/download/1.0.2.0-beta1/irods-cloud-backend.war
docker build -t diceunc/cloud-browser:1.0.2.0 .
docker push diceunc/cloud-browser:1.0.2.0