# Logactaesque Dice Roller

[![CI Pipeline](https://github.com/logactaesque/dice-roller/actions/workflows/ci-pipeline.yml/badge.svg)](https://github.com/logactaesque/dice-roller/actions/workflows/ci-pipeline.yml)

A RESTful service built using [Spring Boot](https://spring.io/projects/spring-boot) that mimics the rolling of Logacta dice when determining the outcome of a football game.

All seven dice are available as per the original rules of the game:

| Dice  | Available Faces  |
|-------|------------------|
|Green  | 0, 1, 2, 3, 4, 5 |
|Red    | 0, 1, 1, 2, 2, 3 |
|Yellow | 0, 0, 1, 1, 1, 2 |
|Brown  | 0, 1, 1, 2, 4, 5 |
|Grey   | 0, 0, 1, 1, 2, 3 |
|Black  | 0, 0, 2, 2, 2, 3 |
|Blue   | 0, 1, 1, 2, 3, 4 |

To build and run the service locally via [Maven](https://maven.apache.org/):

    mvn spring-boot:run &

This builds a jar file and then launches the basic service, by default accessible on port 9001.

## Sample dice-rolling commands using `curl`
A series of GET endpoints are included, each representing the roll of a specific Logacta dice:

    curl localhost:9001/dice/green/roll
    curl localhost:9001/dice/yellow/roll
    curl localhost:9001/dice/brown/roll
    curl localhost:9001/dice/red/roll
    curl localhost:9001/dice/blue/roll
    curl localhost:9001/dice/grey/roll
    curl localhost:9001/dice/black/roll

## Actuator-based commands using curl
Because the implementation relies upon the [Spring Actuator](https://github.com/spring-projects/spring-boot/tree/master/spring-boot-project/spring-boot-actuator), the health endpoint has been made visible to allow you to determine if the service is active and reachable.

    curl localhost:9001/actuator/health

## Docker
A Dockerfile has been created and can be run locally: 

    docker build -t dice-roller .

    docker run -d -p 9001:9001 dice-roller

A Github actions file packages the image and stores it within an ECR repository. 