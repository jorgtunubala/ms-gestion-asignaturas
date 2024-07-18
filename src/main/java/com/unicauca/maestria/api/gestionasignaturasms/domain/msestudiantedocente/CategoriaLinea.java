package com.unicauca.maestria.api.gestionasignaturasms.domain.msestudiantedocente;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.unicauca.maestria.api.gestionasignaturasms.common.enums.msestudiantedocente.EstadoPersona;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
// @Setter
// @Getter
@AllArgsConstructor
@Entity
@Table(name = "categorias_lineas_investigacion")
public class CategoriaLinea {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombre;

    private String descripcion;

    @Enumerated(EnumType.STRING)
    private EstadoPersona estado;

    @OneToMany(mappedBy = "categoria", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<LineaInvestigacion> lineasInvestigacion;

    public CategoriaLinea() {
        estado = EstadoPersona.ACTIVO;
        lineasInvestigacion = new ArrayList<>();
    }

}
