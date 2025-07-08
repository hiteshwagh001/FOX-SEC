# start with a base image that has Java installed
FROM openjdk:21-jdk-slim

# set the working directory in the container
COPY target/ticket-0.0.1-SNAPSHOT.jar app.jar

# excute the jar file
# this will run the application when the container starts
ENTRYPOINT [ "java", "-jar", "app.jar" ]
