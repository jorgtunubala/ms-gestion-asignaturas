package com.unicauca.maestria.api.gestionasignaturasms.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.*;

@Entity
@Table(name="asignaturas_externas")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class AsignaturaExterna {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    
    @Column(name = "programa_procedencia")
    private String programaProcedencia;

    @Column(name = "institucion_procedencia")
    private String institucionProcedencia;

    @Column(name = "nombre")
    private String nombre;

    @Column(name = "numero_creditos")
    private Integer numeroCreditos;

    @Column(name = "intensidadHoraria")
    private Integer intensidadHoraria;

    @Column(name = "contenido_programatico")
    private String contenidoProgramatico;

}
