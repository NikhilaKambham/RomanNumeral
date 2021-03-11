# Getting Started

This Application is a spring based restful service that is used to generate roman values
for a given Integer.

* [Information on Roman Numerals](https://en.wikipedia.org/wiki/Roman_numerals)

### Package Distribution


### Building and Running Project
./gradlew build - to run tests and build the project
./gradlew bootrun - to start the application 
the service should startup at localhost:8080

API: /romannumeral?query=<Integer Value>
Example: http://localhost:8080/romannumeral?query=1


### Running Project via Docker
Build a docker image: ./gradlew bootBuildImage --imageName=romannumbers:latest
Run the image built on this host and port: docker run -p 8080:8080 -t romannumbers

