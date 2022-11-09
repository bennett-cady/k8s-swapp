#!/bin/bash

# mvn clean package

docker build -t benjcady14/mixed_dem0:0.0.1 .

docker push benjcady14/mixed_demo:0.0.1

## if you have the application deployed in a kubernetes cluster
# kubectl apply -f kubernetes/Deployment.yaml -n web-app-demo

## image pull policy is set to always
## it will pull the updated version of the image
