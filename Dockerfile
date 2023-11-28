FROM ubuntu:latest AS build
LABEL authors="huytr"
RUN apt-get update
RUN apt-get install openjdk-11-jdk -y

EXPOSE 8080
COPY target/todolist-0.0.1-SNAPSHOT.jar todolist-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java", "-jar", "todolist-0.0.1-SNAPSHOT.jar"]