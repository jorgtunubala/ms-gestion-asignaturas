package com.unicauca.maestria.api.gestionasignaturasms.mappers;

import com.unicauca.maestria.api.gestionasignaturasms.domain.Asignatura;
import com.unicauca.maestria.api.gestionasignaturasms.dtos.AsignaturaListarDto;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface AsignaturaListarMapper extends GenericMapper<AsignaturaListarDto, Asignatura>{
}
