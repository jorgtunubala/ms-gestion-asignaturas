package com.unicauca.maestria.api.gestionasignaturasms.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.unicauca.maestria.api.gestionasignaturasms.domain.msestudiantedocente.Docente;
import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "docentes_asignaturas", uniqueConstraints = {
        @UniqueConstraint(columnNames = {"id_docente", "id_asignatura"})
})
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class DocenteAsignatura {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "id_docente")
    private Docente docente;

    @ManyToOne
    @JoinColumn(name = "id_asignatura")
    @JsonIgnoreProperties({ "hibernateLazyInitializer", "handler", "docentesAsignaturas" })
    private Asignatura asignatura;

    @Column(name = "dicta_asignatura")
    private Boolean dictaAsignatura;
}
