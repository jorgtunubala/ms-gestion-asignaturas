package com.unicauca.maestria.api.gestionasignaturasms.services.docenteasignatura;

import com.unicauca.maestria.api.gestionasignaturasms.domain.DocenteAsignatura;
import com.unicauca.maestria.api.gestionasignaturasms.dtos.rest.response.DocentesAsignaturasResponse;

import java.util.List;

public interface DocenteAsignaturaService {

    public DocenteAsignatura crear(DocenteAsignatura docenteAsignatura);

    public DocenteAsignatura editar(DocenteAsignatura docenteAsignatura);

    public DocenteAsignatura buscarPorId(DocenteAsignatura docenteAsignatura);

    public List<DocenteAsignatura> buscarTodo();

    public DocenteAsignatura eliminar(DocenteAsignatura docenteAsignatura);

    public List<DocentesAsignaturasResponse> listarDocAsig();

    public List<DocentesAsignaturasResponse> obtenerDocentesAsignaturas(List<Integer> ids);
}
