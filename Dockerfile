FROM openjdk:18
WORKDIR /app
COPY target/compose-0.0.1-SNAPSHOT.jar /app
EXPOSE 8080
CMD ["java", "-jar", "compose-0.0.1-SNAPSHOT.jar"]