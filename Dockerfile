FROM openjdk:8-jdk-alpine
MAINTAINER baeldung.com
COPY target/alexa-0.0.1-SNAPSHOT.jar app-server-1.0.0.jar
ENTRYPOINT ["java","-jar","/message-server-1.0.0.jar"]