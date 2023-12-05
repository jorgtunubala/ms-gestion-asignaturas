package com.unicauca.maestria.api.gestionasignaturasms.mappers.archivos;

import com.unicauca.maestria.api.gestionasignaturasms.domain.archivos.OtroDoc;
import com.unicauca.maestria.api.gestionasignaturasms.dtos.archivos.OtroDocListarDto;
import com.unicauca.maestria.api.gestionasignaturasms.mappers.GenericMapper;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface OtroDocListarMapper extends GenericMapper<OtroDocListarDto, OtroDoc> {
}
