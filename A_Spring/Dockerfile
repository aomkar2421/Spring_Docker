# Use lightweight OpenJDK 17 base image
FROM eclipse-temurin:17-jre-alpine

# Set working directory inside container
WORKDIR /app

# Copy the built JAR from local to container
COPY target/A_Spring-0.0.1-SNAPSHOT-jar-with-dependencies.jar app.jar

# Run the app
ENTRYPOINT ["java", "-jar", "app.jar"]