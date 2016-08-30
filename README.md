# Logactaesque Dice
A web service that mimics the rolling of Logacta dice to determine the outcome of a football game.
All seven dice are available as per the original rules of the game:

| Dice |Available Faces   |
|------|------------------|
|Green | 0, 1, 2, 3, 4, 5 |
|Red   | 0, 1, 1, 2, 2, 3 |
|Yellow| 0, 0, 1, 1, 1, 2 |
|Brown | 0, 1, 1, 2, 4, 5 |
|Grey  | 0, 0, 1, 1, 2, 3 |
|Black | 0, 0, 2, 2, 2, 3 |
|Blue  | 0, 1, 1, 2, 3, 4 |

    mvn clean package && java -jar target/logactaesque-dice-1.0-SNAPSHOT.jar &

This builds a jar file and then permits us to launch the basic service, accessible on port 8080.

## Sample commands using curl
    curl localhost:8080/health
    curl localhost:8080/dice/green/roll
    curl localhost:8080/dice/yellow/roll
    curl localhost:8080/dice/brown/roll
    curl localhost:8080/dice/red/roll
    curl localhost:8080/dice/blue/roll
    curl localhost:8080/dice/grey/roll
    curl localhost:8080/dice/black/roll
