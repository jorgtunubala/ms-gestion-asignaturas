@echo off
set SPRING_DATASOURCE_URL=jdbc:mysql://dockertest.unicauca.edu.co:4207/computacion
set SPRING_DATASOURCE_USERNAME=computacion
set SPRING_DATASOURCE_PASSWORD=DB-C0mput4c10N
set SPRING_SERVER_ASIGNATURAS_PORT=8085

mvn clean package
