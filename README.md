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

## How to use
* This application can be found on dockerhub under the name 'benjcady14/number-ops002'
    * Steps below require docker account and docker desktop installed:
        * Run the command '_docker pull benjcady14/number-ops002_'
        * Verify images was pulled: run '_docker images_', the image should be listed
        * Run
            '_docker run -d --name number-ops002 -p 127.0.0.1:8080:8080 benjcady14/number-ops002_'
        * This runs the image on your local machine. You can now send requests to 127.0.0.1:8080/{routes here}
## Routes        

