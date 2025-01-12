# Use an official OpenJDK runtime as a parent image
FROM openjdk:17-jdk-slim

# Set the working directory in the container
WORKDIR /app

# Copy the Spring Boot JAR file into the container
COPY target/HolaMundoThymeleaf-1.jar /app/HolaMundoThymeleaf.jar

# Expose the port that your application will run on
EXPOSE 9080

# Run the JAR file
ENTRYPOINT ["java", "-jar", "HolaMundoThymeleaf.jar"]
