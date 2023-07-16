FROM openjdk:17-oracle
COPY target/alexa-0.0.1-SNAPSHOT.jar alexa-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java", "-jar", "/alexa-0.0.1-SNAPSHOT.jar"]