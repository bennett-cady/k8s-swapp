#!/bin/bash

kubectl apply -f https://raw.githubusercontent.com/kubernetes/ingress-nginx/master/deploy/provider/cloud-generic.yaml

## If namespace does not exist already
# kubectl create namespace web-app-demo

kubectl apply -f Ingress.yaml -n web-app-demo

kubectl apply -f Service.yaml -n web-app-demo

kubectl apply -f Deployment.yaml -n web-app-demo

kubectl get po -n web-app-demo -w 
