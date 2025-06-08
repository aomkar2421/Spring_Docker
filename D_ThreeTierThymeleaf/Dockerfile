# # --------- BUILD STAGE ---------
# FROM maven:3.9.6-eclipse-temurin-17 AS builder
# WORKDIR /app
# COPY . .
# RUN chmod +x mvnw
# RUN ./mvnw clean package -DskipTests

# # --------- RUNTIME STAGE ---------
# FROM gcr.io/distroless/java17-debian11
# WORKDIR /app
# COPY --from=builder /app/target/*.jar app.jar
# EXPOSE 8080
# ENTRYPOINT ["java", "-jar", "app.jar"]


# # Use OpenJDK 21 as base image
# FROM openjdk:21-jdk-slim

# # Set working directory inside container
# WORKDIR /app

# # Copy the JAR file from target directory to container
# # Replace with your actual JAR filename
# # COPY target/D_ThreeTierThymeleaf-0.0.1-SNAPSHOT.jar app.jar
# COPY target/*.jar app.jar

# # Expose port 8080
# EXPOSE 8080

# # Run the application
# ENTRYPOINT ["java", "-jar", "app.jar"]



FROM gcr.io/distroless/java21-debian12
WORKDIR /app
COPY target/*.jar app.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "app.jar"]