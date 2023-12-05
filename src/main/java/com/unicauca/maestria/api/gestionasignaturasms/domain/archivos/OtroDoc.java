package com.unicauca.maestria.api.gestionasignaturasms.domain.archivos;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "otros_documentos")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
public class OtroDoc {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idOtroDoc;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id_doc_maestria")
    private DocumentoMaestria idDocMaestria;

    @Column(name = "nombredocumento")
    private String nombreDocumento;

    @Column(name = "versiondoc")
    private Long versionDoc;

    @Column(name = "descripcion_documento")
    private String descripcionDocumento;

}
