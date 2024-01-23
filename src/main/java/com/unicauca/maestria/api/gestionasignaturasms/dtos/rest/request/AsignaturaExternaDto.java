package com.unicauca.maestria.api.gestionasignaturasms.dtos.rest.request;

import lombok.Data;

@Data
public class AsignaturaExternaDto {
    private String programaProcedencia;
    private String institutoProcedencia;
    private String nombreAsignatura;
    private Integer numeroCreditos;
    private Integer intensidadHoraria;
    private Double calificacion;
    private String contenidoProgramatico;
}
