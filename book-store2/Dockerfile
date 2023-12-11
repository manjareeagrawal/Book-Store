FROM ubuntu:latest

WORKDIR /app

COPY . /app 

RUN apt-get update && apt-get install -y jdk openjdk:17

ENV NAME World

CMD["java","-jar","/book-store.jar"]
