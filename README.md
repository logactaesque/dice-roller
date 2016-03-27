# Logactaesque Dice
A web service that mimics the rolling of Logacta dice to determine the outcome of a football game.

    mvn clean package && java -jar target/logactaesque-dice-1.0-SNAPSHOT.jar &

This builds a jar file and then permits us to launch the basic service, accessible on port 8080.

## Available commands
    curl localhost:8080/health
    curl localhost:8080/dice/green/roll
    curl localhost:8080/dice/yellow/roll
    curl localhost:8080/dice/brown/roll
    curl localhost:8080/dice/red/roll
    curl localhost:8080/dice/blue/roll
    curl localhost:8080/dice/grey/roll
    curl localhost:8080/dice/black/roll
