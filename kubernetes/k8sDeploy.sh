#!/bin/bash

## If Ingress not present 
# kubectl apply -f https://raw.githubusercontent.com/kubernetes/ingress-nginx/master/deploy/provider/cloud-generic.yaml

## If namespace does not exist already
# kubectl create namespace mixed-demo

## Ingress is not used when application is deployed on minkube
## kubectl delete ing swapp-ing -n mixed-demo
# kubectl apply -f Ingress.yaml -n mixed-demo

kubectl apply -f Service.yaml -n mixed-demo
# minikube service simple-web app-service --url -n mixed-demo

kubectl apply -f Deployment.yaml -n mixed-demo

kubectl get po -n mixed-demo -w 
