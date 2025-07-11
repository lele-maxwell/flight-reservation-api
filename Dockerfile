FROM eclipse-temurin:17-jdk-alpine
WORKDIR /app
COPY build/libs/flight-reservation-api-*.war ./
ENTRYPOINT ["java", "-jar", "flight-reservation-api-0.0.1-SNAPSHOT.war"]
