package com.unicauca.maestria.api.gestionasignaturasms.domain.archivos;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "documentos_maestria")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class DocumentoMaestria {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idDocMaestria;

    @Column(name = "link_documento")
    private String linkDocumento;

    @Column(name = "estado")
    private Boolean estado;

}
