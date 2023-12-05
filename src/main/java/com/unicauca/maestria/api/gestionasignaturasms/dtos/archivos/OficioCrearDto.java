package com.unicauca.maestria.api.gestionasignaturasms.dtos.archivos;

import com.unicauca.maestria.api.gestionasignaturasms.domain.archivos.DocumentoMaestria;
import lombok.*;

import javax.persistence.Transient;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.PastOrPresent;
import javax.validation.constraints.Positive;
import javax.validation.constraints.Size;
import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class OficioCrearDto {

    @NotNull
    @Valid
    @Transient
    private DocumentoMaestria idDocMaestria;

    @NotNull
    @Positive
    private Long numeroOficio;

    @NotNull
    @PastOrPresent
    private Date fechaOficio;

    @NotNull
    private String asuntoOfi;
}
