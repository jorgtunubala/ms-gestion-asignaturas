package com.unicauca.maestria.api.gestionasignaturasms.domain;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.unicauca.maestria.api.gestionasignaturasms.domain.archivos.Acta;
import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "actas_asignaturas", uniqueConstraints = {
        @UniqueConstraint(columnNames = {"id_acta", "id_asignatura"})
})
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ActaAsignatura {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "id_acta")
    private Acta acta;

    @ManyToOne
    @JoinColumn(name = "id_asignatura")
    @JsonIgnoreProperties({ "hibernateLazyInitializer", "handler", "actasAsignaturas" })
    private Asignatura asignatura;


    @Column(name = "is_acta_asignatura")
    private Boolean isActaAsignatura;

}
