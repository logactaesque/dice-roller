# Logactaesque Dice
A web service that mimics the rolling of Logacta dice to determine the outcome of a football game.

    mvn clean package && java -jar target/logactaesque-dice-1.0-SNAPSHOT.jar &

This builds a jar file and then permits us to launch the basic service, accessible on port 8080.

## Available commands
    curl localhost:8080/health
    curl localhost:8080/dice/roll
