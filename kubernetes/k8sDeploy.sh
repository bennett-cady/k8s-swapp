#!/bin/bash

kubectl apply -f https://raw.githubusercontent.com/kubernetes/ingress-nginx/master/deploy/provider/cloud-generic.yaml

kubectl create namespace webAppDemo

kubectl apply -f Ingress.yaml

kubectl apply -f Service.yaml

kubectl apply -f Deployment.yaml

kubectl get po -n webAppDemo -w 