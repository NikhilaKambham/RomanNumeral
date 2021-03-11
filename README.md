# Getting Started

This Application is a spring based restful service that is used to generate roman values
for a given Integer. 

While there are documents of usage of both subtractive and additive usage, this application
calculates the subtractive usage of a given roman numeral
Example: 9 will be represented as IX as opposed to VIIII

* [Information on Roman Numerals](https://en.wikipedia.org/wiki/Roman_numerals)


### Building and Running Project
* Build project: `./gradlew build` 
* Run Project: `./gradlew bootrun`

the service should startup at localhost:8080

* API: `/romannumeral?query=<Integer Value>`

`Example: http://localhost:8080/romannumeral?query=1`

* Actuator Endpoint

http://localhost:8080/actuator

### Running Project via Docker

#### Prerequisites
You should have Docker Daemon running on your local machine.
You will see the below error otherwise

` Connection to the Docker daemon at 'localhost' failed with error "[61] Connection refused"; ensure the Docker daemon is running and accessibl`


We can build docker image using gradle.

* Build a docker image: `./gradlew bootBuildImage --imageName=romannumbers:latest`
* Run the image built on this 8080: `docker run -p 8080:8080 -t romannumbers`

### With Dockerfile

* Build Image: `docker build --tag=roman-numbers:latest .`
* Run Image: `docker run -it -p8080:8080 roman-numbers:latest`

### Metrics

This application uses prometheus for logging its metrics

http://localhost:8080/actuator/prometheus

Some application metrics that can be useful are:

```
// log count
logback_events_total{level="error",} 0.0
logback_events_total{level="info",} 12.0

// request info with outcome
http_server_requests_seconds_count{exception="None",method="GET",outcome="SUCCESS",status="200",uri="/romannumeral",} 1.0

// latency, time taken for each request
romannumeral_latency_seconds_count{origin="roman_numbers_controller",} 1.0
romannumeral_latency_seconds_sum{origin="roman_numbers_controller",} 0.012854643
```

### Engineering and Test Methodology 




### Dependencies

* Spring framework
* JUnit for testing
* Jackson for json
* Prometheus for monitoring
* slf4j for logging