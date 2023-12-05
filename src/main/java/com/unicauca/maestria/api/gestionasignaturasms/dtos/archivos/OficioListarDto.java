package com.unicauca.maestria.api.gestionasignaturasms.dtos.archivos;

import com.unicauca.maestria.api.gestionasignaturasms.domain.archivos.DocumentoMaestria;
import lombok.*;

import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class OficioListarDto {

    private Long idOficio;
    private DocumentoMaestria idDocMaestria;
    private Long numeroOficio;
    private Date fechaOficio;
    private String asuntoOfi;
}
