package com.unicauca.maestria.api.gestionasignaturasms.services.rest.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.unicauca.maestria.api.gestionasignaturasms.domain.AsignaturaExterna;
import com.unicauca.maestria.api.gestionasignaturasms.dtos.rest.request.AsignaturaExternaDto;
import com.unicauca.maestria.api.gestionasignaturasms.dtos.rest.response.AsignaturaExternaResponseDto;
import com.unicauca.maestria.api.gestionasignaturasms.repositories.AsignaturaExternaRepository;
import com.unicauca.maestria.api.gestionasignaturasms.services.rest.AsignaturaExternaService;

@Service
public class AsignaturaExternaServiceImpl implements AsignaturaExternaService {

    @Autowired
    private AsignaturaExternaRepository asignaturaExternaRepository;

    @Override
    public AsignaturaExternaResponseDto registrarAsignaturasExternas(AsignaturaExternaDto asignatura) {
        AsignaturaExternaResponseDto response = null;
        try {
            AsignaturaExterna asignaturaExterna = new AsignaturaExterna();
            asignaturaExterna.setInstitucionProcedencia(asignatura.getInstitutoProcedencia());
            asignaturaExterna.setProgramaProcedencia(asignatura.getProgramaProcedencia());
            asignaturaExterna.setNombre(asignatura.getNombreAsignatura());
            asignaturaExterna.setNumeroCreditos(asignatura.getNumeroCreditos());
            asignaturaExterna.setIntensidadHoraria(asignatura.getIntensidadHoraria());
            asignaturaExterna.setContenidoProgramatico(asignatura.getContenidoProgramatico());
            asignaturaExterna = asignaturaExternaRepository.save(asignaturaExterna);
            response = new AsignaturaExternaResponseDto();
            response.setIdAsignatura(asignaturaExterna.getId());
            response.setNombre(asignaturaExterna.getNombre());
            return response;          
        } catch (Exception e) {
            System.out.println("Ocurrió un error al guardar las asignaturas externas.");
            e.printStackTrace();
            return response;
        }
    }
    
}
