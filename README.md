# Getting Started

This Application is a spring based restful service that is used to generate roman values
for a given Integer. 

While there are documents of usage of both subtractive and additive usage, this application
calculates the subtractive usage of a given roman numeral
Example: 9 will be represented as IX as opposed to VIIII

* [Information on Roman Numerals](https://en.wikipedia.org/wiki/Roman_numerals)


### Building and Running Project
* Build project: ./gradlew build 
* Run Project: ./gradlew bootrun

the service should startup at localhost:8080

* API
 /romannumeral?query=<Integer Value>
Example: http://localhost:8080/romannumeral?query=1


* Actuator Endpoint
http://localhost:8080/actuator


### Running Project via Docker

#### Prerequisites
You should have Docker Daemon running on your local machine.
You will see the below error if not
` Connection to the Docker daemon at 'localhost' failed with error "[61] Connection refused"; ensure the Docker daemon is running and accessibl`


We can build docker image using buildpack tools provided by spring.

* Build a docker image: ./gradlew bootBuildImage --imageName=romannumbers:latest
* Run the image built on this host and port: docker run -p 8080:8080 -t romannumbers

### Package Distribution


### Dependencies Used


### Metrics Monitoring



### Engineering and Test Methodology 