#!/bin/bash

# mvn clean package

docker build -t benjcady14/number-ops002 .

docker push benjcady14/number-ops002

## if you have the application deployed in a kubernetes cluster
# kubectl apply -f kubernetes/Deployment.yaml

## image pull policy is set to always
## it will pull the updated version of the image
