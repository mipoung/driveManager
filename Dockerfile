FROM eclipse-temurin:17-jdk
COPY driveManager-0.0.1-SNAPSHOT.jar /app/app.jar
WORKDIR /app
EXPOSE 8082
CMD ["java", "-jar", "app.jar"]
