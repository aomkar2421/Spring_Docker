# # --------- BUILD STAGE ---------
# FROM maven:3.9.6-eclipse-temurin-17 AS builder
# WORKDIR /app
# COPY . .
# RUN mvn clean package -DskipTests

# # --------- RUNTIME STAGE ---------
# FROM eclipse-temurin:17-jdk-alpine
# WORKDIR /app
# COPY --from=builder /app/target/C_SpringWeb-0.0.1-SNAPSHOT.jar app.jar
# EXPOSE 8080
# ENTRYPOINT ["java", "-jar", "app.jar"]





#########################################################


# --------- BUILD STAGE ---------
FROM maven:3.9.6-eclipse-temurin-17 AS builder
WORKDIR /app
COPY . .
RUN mvn clean package -DskipTests

# --------- RUNTIME STAGE ---------
FROM gcr.io/distroless/java17-debian11
WORKDIR /app
COPY --from=builder /app/target/C_SpringWeb-0.0.1-SNAPSHOT.jar app.jar
EXPOSE 8080
CMD ["app.jar"]