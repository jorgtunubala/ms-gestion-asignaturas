package com.unicauca.maestria.api.gestionasignaturasms.mappers;

import com.unicauca.maestria.api.gestionasignaturasms.domain.msestudiantedocente.LineaInvestigacion;
import com.unicauca.maestria.api.gestionasignaturasms.dtos.LineaInvestigacionDto;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface LineaInvestigacionMapper extends GenericMapper<LineaInvestigacionDto, LineaInvestigacion>{
}
