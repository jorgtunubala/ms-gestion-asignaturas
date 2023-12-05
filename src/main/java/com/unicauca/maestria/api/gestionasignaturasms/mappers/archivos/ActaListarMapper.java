package com.unicauca.maestria.api.gestionasignaturasms.mappers.archivos;

import com.unicauca.maestria.api.gestionasignaturasms.domain.archivos.Acta;
import com.unicauca.maestria.api.gestionasignaturasms.dtos.archivos.ActaListarDto;
import com.unicauca.maestria.api.gestionasignaturasms.mappers.GenericMapper;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ActaListarMapper extends GenericMapper<ActaListarDto, Acta>{
}
