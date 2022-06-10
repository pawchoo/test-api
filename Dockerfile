FROM amazoncorretto:11-alpine
COPY backend/build/libs/test-api-0.0.1-SNAPSHOT.jar test-api-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java", "-jar", "test-api-0.0.1-SNAPSHOT.jar"]