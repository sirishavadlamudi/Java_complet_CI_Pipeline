FROM openjdk:17-jdk-alpine

WORKDIR /app
COPY . .

RUN javac Main.java HelloController.java

CMD ["java", "Main"]
