FROM amazoncorretto:17-alpine-jdk

COPY target/gestion-asignaturas-ms-0.0.1-SNAPSHOT.jar app.jar

ENTRYPOINT ["java", "-jar", "/app.jar"]