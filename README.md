# k8s-swapp

## Overview
This simple project demonstrates usage of OOP with Java, creating web applications with Spring Boot, virtualization with Docker, and deploying web applications on Kubernetes.
* Source code for Spring Boot can be found in src/main/java
    * Abstract Data Type objects are found in the folder 'AbstractDataTypes'
    * Project source code is found under com/SimpleProject
        * Service files use logic tol solve problems to solve tasks such as converting an integer to binary or determining whether or not a number is prime
        * Controller files take http requests, use the Service files to make computations, then send an http request with the answer
* Unit testing for the project can be found under src/main/test
* Dockerfile lists the steps used to build the docker image
* The folder titled 'kubernetes' contains the manifests (.yaml files) used to deploy this application in a kubernetes cluster
