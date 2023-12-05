package com.unicauca.maestria.api.gestionasignaturasms.mappers.archivos;

import com.unicauca.maestria.api.gestionasignaturasms.domain.archivos.DocumentoMaestria;
import com.unicauca.maestria.api.gestionasignaturasms.dtos.archivos.DocumentoMaestriaCrearaDto;
import com.unicauca.maestria.api.gestionasignaturasms.mappers.GenericMapper;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface DocumentoMaestriaCrearMapper extends GenericMapper<DocumentoMaestriaCrearaDto, DocumentoMaestria> {
}
