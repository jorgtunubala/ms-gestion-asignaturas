package com.unicauca.maestria.api.gestionasignaturasms.dtos.archivos;

import com.unicauca.maestria.api.gestionasignaturasms.domain.archivos.DocumentoMaestria;
import lombok.*;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Positive;
import javax.validation.constraints.Size;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
public class OtroDocCrearDto {

    @NotNull
    @Valid
    private DocumentoMaestria idDocMaestria;

    @NotNull
    private String nombreDocumento;

    @NotNull
    @Positive
    private Long versionDoc;

    @NotNull
    private String descripcionDocumento;
}
