# Simple Java CI/CD App

This is a minimal Java app without Maven, ready for CI/CD pipeline.

## Run Locally
javac Main.java HelloController.java
java Main

## Docker
docker build -t sirisha849/my-java-app:local .
docker run sirisha849/my-java-app:local
