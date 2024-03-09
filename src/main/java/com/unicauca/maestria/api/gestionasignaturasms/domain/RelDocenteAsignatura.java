package com.unicauca.maestria.api.gestionasignaturasms.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name = "rel_asignatura_docente")
@Data
public class RelDocenteAsignatura {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nombre_asignatura")
    private String nombreAsignatura;

    @Column(name = "codigo_asignatura")
    private String codigoAsignatura;

    @Column(name = "id_docente")
    private Integer idDocente;

    
}
