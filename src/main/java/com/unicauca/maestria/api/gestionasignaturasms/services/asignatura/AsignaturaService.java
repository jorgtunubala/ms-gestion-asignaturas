package com.unicauca.maestria.api.gestionasignaturasms.services.asignatura;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.unicauca.maestria.api.gestionasignaturasms.domain.ActaAsignatura;
import com.unicauca.maestria.api.gestionasignaturasms.domain.Asignatura;
import com.unicauca.maestria.api.gestionasignaturasms.domain.DocenteAsignatura;
import com.unicauca.maestria.api.gestionasignaturasms.dtos.AsignaturaCrearDto;
import com.unicauca.maestria.api.gestionasignaturasms.dtos.AsignaturaListarDto;
import org.springframework.validation.BindingResult;

import java.util.List;

public interface AsignaturaService {

    public AsignaturaListarDto crear(AsignaturaCrearDto asignatura, BindingResult result);

    public AsignaturaListarDto editar(Long id, AsignaturaCrearDto asignatura, BindingResult result);

    public AsignaturaListarDto buscarPorId(Long id);

    public Asignatura buscarPorIdCompleto(Long id);

    public List<AsignaturaListarDto> buscarTodo();

    public boolean existNombre(String nombre);

    public boolean existCodigo(Long codigo);

    public List<AsignaturaListarDto> buscarTodoPorEstado(Boolean estado);

    public List<DocenteAsignatura> getDocentesAsignaturasByEstado(Boolean estado);

    public List<ActaAsignatura> getActasAsignaturasByEstado(Boolean estado);

}
