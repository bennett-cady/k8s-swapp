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
* This application can be found on dockerhub under the name 'benjcady14/mixed_demo:0.0.1'
    * Steps below require docker account and docker desktop installed:
        * Run the command '_docker pull benjcady14/mixed_demo:0.0.1_'
        * Verify images was pulled: run '_docker images_', the image should be listed
        * Run
            '_docker run -d --name mixed_demo -p 127.0.0.1:8080:8080 benjcady14/mixed_demo:0.0.1_'
        * This runs the image on your local machine. You can now send requests to 127.0.0.1:8080/{routes here}
## Routes        
* Once yourimage is running, you can send requests to 127.0.0.1:8080/
    * /primes/ - a set of routes that deal with primes numbers and their properties
        * /testRoute - prints "You have successfully reached the test route!". Used to verify the container is running
        * /isPrime/n -  enter a number in place of 'n'. The http response body will tell you whether or not that number is prime
        * /nextPrime/n - prints the first prime number that comes after n
            * /nextPrime/2 -> 3
            * /nextPrime/13 -> 17
        * /firstNPrimes/n - prints a list of the first n prime numbers
            * /firstNPrimes/5 - > 2, 3, 5, 7, 11
    * /binary/ - converts integer to binary, and binary to integer, then posts the result in the body of the response
        * /toBinary/n - converts n to binary
            * /toBinary/6 - 110
        * /toInteger/bin - converts the binary string "bin" to an integer
            * /toInteger/4 - 100
   * Sample requests using postman can be found [here](https://github.com/bennett-cady/k8s-swapp/issues/1)
    
  
  
  ## To-do:
  * add exceptions to Controller and Service methods
  * add routes that accept/return json-serialized objects
  * add rotues that call other APIs
  * create kubernetes cluster and use it to deploy the application
        

