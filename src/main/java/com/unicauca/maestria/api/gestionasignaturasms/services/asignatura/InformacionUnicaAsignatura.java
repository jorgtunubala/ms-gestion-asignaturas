package com.unicauca.maestria.api.gestionasignaturasms.services.asignatura;

import com.unicauca.maestria.api.gestionasignaturasms.dtos.AsignaturaCrearDto;
import com.unicauca.maestria.api.gestionasignaturasms.dtos.CamposUnicosDto;
import org.springframework.stereotype.Service;

import java.util.function.Function;

@Service
public class InformacionUnicaAsignatura implements Function<AsignaturaCrearDto, CamposUnicosDto> {

    @Override
    public CamposUnicosDto apply(AsignaturaCrearDto asignaturaCrearDto) {
        return CamposUnicosDto.builder()
                .codigoAsignatura(asignaturaCrearDto.getCodigoAsignatura())
                .nombreAsignatura(asignaturaCrearDto.getNombreAsignatura())
                .build();
    }
}
