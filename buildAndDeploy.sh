#!/bin/bash

mvn clean package

docker build -t benjcady14/number-ops002 .

docker push benjcady14/number-ops002

# if the application is deployed in a kubernetes cluster
# kubectl apply -f kubernetes/deployment.yaml
