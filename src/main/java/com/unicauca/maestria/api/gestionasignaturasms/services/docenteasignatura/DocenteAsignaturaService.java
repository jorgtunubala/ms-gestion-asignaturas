package com.unicauca.maestria.api.gestionasignaturasms.services.docenteasignatura;

import com.unicauca.maestria.api.gestionasignaturasms.domain.DocenteAsignatura;

import java.util.List;

public interface DocenteAsignaturaService {

    public DocenteAsignatura crear(DocenteAsignatura docenteAsignatura);

    public DocenteAsignatura editar(DocenteAsignatura docenteAsignatura);

    public DocenteAsignatura buscarPorId(DocenteAsignatura docenteAsignatura);

    public List<DocenteAsignatura> buscarTodo();

    public DocenteAsignatura eliminar(DocenteAsignatura docenteAsignatura);
}
