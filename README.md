# Logactaesque Dice
A RESTful web service that mimics the rolling of Logacta dice when determining the outcome of a football game.
All seven dice are available as per the original rules of the game:

| Dice | Available Faces  |
|------|------------------|
|Green | 0, 1, 2, 3, 4, 5 |
|Red   | 0, 1, 1, 2, 2, 3 |
|Yello | 0, 0, 1, 1, 1, 2 |
|Brown | 0, 1, 1, 2, 4, 5 |
|Grey  | 0, 0, 1, 1, 2, 3 |
|Black | 0, 0, 2, 2, 2, 3 |
|Blue  | 0, 1, 1, 2, 3, 4 |

To build and run the service locally via [Maven](https://maven.apache.org/):

    mvn clean package && java -jar target/dice-roller-1.0-SNAPSHOT.jar &

This builds a jar file and then launches the basic service, by default accessible on port 8080.
## Sample dice-rolling commands using curl
A series of GET endpoints are provided, each representing the roll of a specific Logacta dice:

    curl localhost:8080/dice/green/roll
    curl localhost:8080/dice/yellow/roll
    curl localhost:8080/dice/brown/roll
    curl localhost:8080/dice/red/roll
    curl localhost:8080/dice/blue/roll
    curl localhost:8080/dice/grey/roll
    curl localhost:8080/dice/black/roll

## Actuator-based commands using curl
Because the implementation relies upon [Spring Boot Actuator](https://github.com/spring-projects/spring-boot/tree/master/spring-boot-actuator),
a number of production endpoints are available that allow state of the service to be inspected:

    curl localhost:8080/health
    curl localhost:8080/metrics
    curl localhost:8080/dump
    curl localhost:8080/info