    # Use a base image with Java installed (e.g., OpenJDK)
    FROM openjdk:17-jdk-slim

    # Set the working directory inside the container
    WORKDIR /app

    # Copy the Maven project's pom.xml to leverage Maven's dependency caching
    COPY pom.xml .

    # Copy the source code
    COPY src ./src

    # Build the application using Maven (this will download dependencies)
    RUN mvn clean package -DskipTests

    # Copy the built JAR/WAR file into the image
    COPY target/*.jar app.jar

    # Expose the port your application listens on (if applicable)
    EXPOSE 8080

    # Define the command to run your application when the container starts
    ENTRYPOINT ["java", "-jar", "app.jar"]
