FROM openjdk:11
COPY target/alexa-0.0.1-SNAPSHOT.jar alexa-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java", "-jar", "/alexa-0.0.1-SNAPSHOT.jar"]