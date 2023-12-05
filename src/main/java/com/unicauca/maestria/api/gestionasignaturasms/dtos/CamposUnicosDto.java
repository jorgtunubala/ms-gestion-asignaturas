package com.unicauca.maestria.api.gestionasignaturasms.dtos;

import lombok.Builder;
import lombok.Data;
import lombok.ToString;

@Data @Builder
@ToString
public class CamposUnicosDto {

    private String nombreAsignatura;
    private Long codigoAsignatura;
}

