FROM alpine:3.18

RUN apk add openjdk17
COPY target/cats-api-0.0.1-SNAPSHOT.jar /app.jar
ENTRYPOINT ["java", "-jar", "/app.jar"]