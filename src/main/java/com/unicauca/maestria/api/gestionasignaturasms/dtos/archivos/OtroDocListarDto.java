package com.unicauca.maestria.api.gestionasignaturasms.dtos.archivos;

import com.unicauca.maestria.api.gestionasignaturasms.domain.archivos.DocumentoMaestria;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class OtroDocListarDto {

    private Long idOtroDoc;
    private DocumentoMaestria idDocMaestria;
    private String nombreDocumento;
    private Long versionDoc;
    private String descripcionDocumento;
}
