FROM maven:3.9.4-eclipse-temurin-17-alpine AS build
RUN mkdir -p /app
WORKDIR /app
COPY pom.xml /app
COPY src /app/src
RUN mvn -B package --file pom.xml -DskipTests

# Fetch the Java
FROM eclipse-temurin:17-jre

# Expose port 8080
EXPOSE 8080
# set a docker volume if you want
VOLUME /backend_volume
# Add the jar file
ADD /target/*.jar ex7_test-coverage-0.0.1-SNAPSHOT.jar
# Start the application
ENTRYPOINT ["java", "-jar", "/ex7_test-coverage-0.0.1-SNAPSHOT.jar"]
