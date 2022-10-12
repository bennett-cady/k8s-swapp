#!/bin/bash

image = benjcady14/number-ops002

mvn clean package

docker build -t $image .

docker push $image

# if the application is deployed in a kubernetes cluster
# kubectl apply -f kubernetes/deployment.yaml
