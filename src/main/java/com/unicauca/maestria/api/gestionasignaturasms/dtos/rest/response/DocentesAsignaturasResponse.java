package com.unicauca.maestria.api.gestionasignaturasms.dtos.rest.response;

import lombok.Data;

@Data
public class DocentesAsignaturasResponse {
    private Integer id;
    private String nombreAsignatura;
    private String codigoAsignatura;
    private Integer idDocente;
}
