package com.unicauca.maestria.api.gestionasignaturasms.services.docenteasignatura;

import com.unicauca.maestria.api.gestionasignaturasms.domain.DocenteAsignatura;
import com.unicauca.maestria.api.gestionasignaturasms.domain.RelDocenteAsignatura;
import com.unicauca.maestria.api.gestionasignaturasms.dtos.rest.response.DocentesAsignaturasResponse;
import com.unicauca.maestria.api.gestionasignaturasms.repositories.RelDocenteAsignaturaRepository;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DocenteAsignaturaServiceImpl implements DocenteAsignaturaService{
    
    @Autowired
    private RelDocenteAsignaturaRepository docenteAsignaturaRepository;
    
    @Override
    public DocenteAsignatura crear(DocenteAsignatura docenteAsignatura) {
        return null;
    }

    @Override
    public DocenteAsignatura editar(DocenteAsignatura docenteAsignatura) {
        return null;
    }

    @Override
    public DocenteAsignatura buscarPorId(DocenteAsignatura docenteAsignatura) {
        return null;
    }

    @Override
    public List<DocenteAsignatura> buscarTodo() {
        return null;
    }

    @Override
    public DocenteAsignatura eliminar(DocenteAsignatura docenteAsignatura) {
        return null;
    }

    @Override
    public List<DocentesAsignaturasResponse> listarDocAsig() {
        List<RelDocenteAsignatura> docenteAsignaturas = docenteAsignaturaRepository.findAll();
        List<DocentesAsignaturasResponse> dAsignaturasResponse = convertToDocenteAsignaturaResponse(docenteAsignaturas);        
        return dAsignaturasResponse;
    }

    @Override
    public List<DocentesAsignaturasResponse> obtenerDocentesAsignaturas(List<Integer> ids) {
        Iterable<Integer> iterator = ids;
        List<RelDocenteAsignatura> lista = docenteAsignaturaRepository.findAllById(iterator);
        List<DocentesAsignaturasResponse> docentesAsignaturasResponses = convertToDocenteAsignaturaResponse(lista);        
        return docentesAsignaturasResponses;
    }

    private List<DocentesAsignaturasResponse> convertToDocenteAsignaturaResponse(List<RelDocenteAsignatura> relDocenteAsignaturas){
        List<DocentesAsignaturasResponse> docentesAsignaturasResponses = new ArrayList<>();
        for (RelDocenteAsignatura relDocenteAsignatura : relDocenteAsignaturas) {
            DocentesAsignaturasResponse info = new DocentesAsignaturasResponse();
            info.setId(relDocenteAsignatura.getId().intValue());
            info.setNombreAsignatura(relDocenteAsignatura.getNombreAsignatura());
            info.setCodigoAsignatura(relDocenteAsignatura.getCodigoAsignatura());
            info.setIdDocente(relDocenteAsignatura.getIdDocente());
            docentesAsignaturasResponses.add(info);
        }
        return docentesAsignaturasResponses;    
    }
}
