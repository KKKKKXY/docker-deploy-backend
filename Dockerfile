FROM openjdk:8-jdk-alpine
ARG JAVA_FILE
COPY ${JAVA_FILE} app.jar
EXPOSE 8080

ENTRYPOINT [ "java","-Djava.security.egd=file:/dev/./urandom",\
    "-Dspring.profiles.active=dev-server",\
    "-jar","/app.jar"]