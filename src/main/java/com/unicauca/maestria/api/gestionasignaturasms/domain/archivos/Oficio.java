package com.unicauca.maestria.api.gestionasignaturasms.domain.archivos;

import lombok.*;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "oficios")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Oficio {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idOficio;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id_doc_maestria")
    private DocumentoMaestria idDocMaestria;

    @Column(name = "numoficio")
    private Long numeroOficio;

    @Column(name = "fechaoficio")
    private Date fechaOficio;

    @Column(name = "asuntoofi")
    private String asuntoOfi;

}
