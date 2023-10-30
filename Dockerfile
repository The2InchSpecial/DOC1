FROM maven:3.9.4-eclipse-temurin-17-alpine AS build
RUN mkdir -p /app
WORKDIR /app
COPY pom.xml /app
COPY src /app/src
RUN mvn -B package --file pom.xml -DskipTests

# Fetch the Java
FROM eclipse-temurin:17-jdk-alpine

# Expose port 8080
EXPOSE 8080
# Add the jar file
COPY --from=build /app/target/*jar cicd-demo-1.3.jar
# Start the application
ENTRYPOINT ["java","-jar","cicd-demo-1.3.jar"]
