package com.unicauca.maestria.api.gestionasignaturasms;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class GestionAsignaturasMsApplication {

    public static void main(String[] args) {
        SpringApplication.run(GestionAsignaturasMsApplication.class, args);
    }

}
