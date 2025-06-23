# Use a base image with OpenJDK (Java Development Kit)
FROM openjdk:17-alpine

# Set the working directory inside the container
WORKDIR /app

# Copy the application's JAR file into the container
# Assuming your JAR file is named 'your-application.jar' and is in the same directory as the Dockerfile
COPY your-application.jar /app/your-application.jar

# Define the command to run the application when the container starts
CMD ["java", "-jar", "your-application.jar"]
