package com.unicauca.maestria.api.gestionasignaturasms.dtos.archivos;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class DocumentoMaestriaListarDto {

    private Long idDocMaestria;
    private String linkDocumento;
    private Boolean estado;
}
