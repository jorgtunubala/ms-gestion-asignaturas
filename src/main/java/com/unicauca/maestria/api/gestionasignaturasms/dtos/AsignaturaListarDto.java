package com.unicauca.maestria.api.gestionasignaturasms.dtos;

import lombok.*;

import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class AsignaturaListarDto {

    private Long idAsignatura;
    private Long codigoAsignatura;
    private String nombreAsignatura;
    private Boolean estadoAsignatura;
    private Date fechaAprobacion;
}
