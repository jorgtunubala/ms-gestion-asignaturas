package com.unicauca.maestria.api.gestionasignaturasms.mappers;

import com.unicauca.maestria.api.gestionasignaturasms.domain.AreaFormacion;
import com.unicauca.maestria.api.gestionasignaturasms.dtos.AreaFormacionDto;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface AreaFormacionMapper extends GenericMapper<AreaFormacionDto, AreaFormacion>{
}
