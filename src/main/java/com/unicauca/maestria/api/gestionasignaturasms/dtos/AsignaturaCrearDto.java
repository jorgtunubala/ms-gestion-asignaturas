package com.unicauca.maestria.api.gestionasignaturasms.dtos;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.unicauca.maestria.api.gestionasignaturasms.common.enums.msestudiantedocente.TipoAsignatura;
import com.unicauca.maestria.api.gestionasignaturasms.domain.ActaAsignatura;
import com.unicauca.maestria.api.gestionasignaturasms.domain.AreaFormacion;
import com.unicauca.maestria.api.gestionasignaturasms.domain.DocenteAsignatura;
import com.unicauca.maestria.api.gestionasignaturasms.domain.archivos.Acta;
import com.unicauca.maestria.api.gestionasignaturasms.domain.msestudiantedocente.Docente;
import com.unicauca.maestria.api.gestionasignaturasms.domain.msestudiantedocente.LineaInvestigacion;
import com.unicauca.maestria.api.gestionasignaturasms.dtos.archivos.OficioCrearDto;
import com.unicauca.maestria.api.gestionasignaturasms.dtos.archivos.OtroDocCrearDto;
import lombok.*;

import javax.persistence.Transient;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Positive;
import javax.validation.constraints.PositiveOrZero;
import javax.validation.constraints.Size;
import java.util.Date;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class AsignaturaCrearDto {

    @NotNull
    @Positive
    private Long codigoAsignatura;

    @NotNull
    @Size(min = 1, max = 50)
    private String nombreAsignatura;

    @NotNull
    private Boolean estadoAsignatura;

    @NotNull
    private Date fechaAprobacion;

    @NotNull
    @Transient
    private OficioCrearDto oficioFacultad;//archivo oficio

    @NotNull
    @Valid
    private AreaFormacion areaFormacion;

    @Valid
    private LineaInvestigacion lineaInvestigacionAsignatura;

    @NotNull
    private TipoAsignatura tipoAsignatura;

    @NotNull
    @Positive
    private Integer creditos;

    @NotNull
    @Size(min = 1)
    private String objetivoAsignatura;

    @NotNull
    @Size(min = 1)
    private String contenidoAsignatura;

    @NotNull
    private OtroDocCrearDto contenidoProgramatico;//aarchivo pdf

    @NotNull
    private OtroDocCrearDto microcurriculo;//archivo pdf

    @NotNull
    @PositiveOrZero
    private Integer horasPresencial;

    @NotNull
    @PositiveOrZero
    private Integer horasNoPresencial;

    @NotNull
    @Positive
    private Integer horasTotal;

    private List<Docente> listaDocentes;

    private List<Acta> listaActas;

    private List<DocenteAsignatura> docentesAsignaturas;

    private List<ActaAsignatura> actasAsignaturas;
}
