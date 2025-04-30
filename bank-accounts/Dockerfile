# Use an official OpenJDK image as base
FROM openjdk:21-jdk-slim

# Set the working directory in the container
WORKDIR /app

# Copy the jar file into the container
COPY build/libs/bank_accounts-0.0.1.jar app.jar

# Expose the port your app runs on (e.g., 8080)
EXPOSE 8080

# Command to run the jar
ENTRYPOINT ["java", "-jar", "app.jar"]