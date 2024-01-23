package com.unicauca.maestria.api.gestionasignaturasms.services.rest;

import com.unicauca.maestria.api.gestionasignaturasms.dtos.rest.request.AsignaturaExternaDto;
import com.unicauca.maestria.api.gestionasignaturasms.dtos.rest.response.AsignaturaExternaResponseDto;

public interface AsignaturaExternaService {
    AsignaturaExternaResponseDto registrarAsignaturasExternas(AsignaturaExternaDto asignaturaExternaDto);
}
