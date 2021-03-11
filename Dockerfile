FROM adoptopenjdk/openjdk11:alpine-jre

# ./gradlew build will create the jar in the build/libs directory
COPY build/libs/*.jar roman-numbers-0.0.1.jar

ENTRYPOINT ["java","-jar","/roman-numbers-0.0.1.jar"]
