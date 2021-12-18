# Start with a base image containing Java runtime
# FROM adoptopenjdk/openjdk11:alpine-slim
FROM openjdk:17-alpine

COPY ./target/dice-roller-1.0.0-SNAPSHOT.jar /usr/app/

WORKDIR /usr/app

RUN sh -c 'touch dice-roller-1.0.0-SNAPSHOT.jar'

ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","dice-roller-1.0.0-SNAPSHOT.jar"]