package com.unicauca.maestria.api.gestionasignaturasms.dtos.rest.response;

import lombok.Data;

@Data
public class AsignaturaExternaResponseDto {
    private Integer idAsignatura;
    private String nombre;
    private Integer creditos;
    private Integer intensidadHoraria;    
    private String programa;
    private String institucion;
}
