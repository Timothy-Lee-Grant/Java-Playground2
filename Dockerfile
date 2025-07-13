# Start with a base Java image
FROM openjdk:17-jdk-alpine

# Set the working directory
WORKDIR /app

# Copy the built jar file (adjust the name accordingly)
COPY target/demo-0.0.1-SNAPSHOT.jar app.jar

# Set the entrypoint to run the jar
ENTRYPOINT ["java", "-jar", "app.jar"]
