package com.unicauca.maestria.api.gestionasignaturasms.mappers;

import com.unicauca.maestria.api.gestionasignaturasms.domain.Asignatura;
import com.unicauca.maestria.api.gestionasignaturasms.dtos.AsignaturaCrearDto;
import org.mapstruct.InjectionStrategy;
import org.mapstruct.Mapper;

@Mapper(injectionStrategy = InjectionStrategy.CONSTRUCTOR,
        componentModel = "spring",
        uses = {LineaInvestigacionMapper.class, AreaFormacionMapper.class})
public interface AsignaturaCrearMapper extends GenericMapper<AsignaturaCrearDto, Asignatura> {
}
