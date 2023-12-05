package com.unicauca.maestria.api.gestionasignaturasms.mappers.archivos;

import com.unicauca.maestria.api.gestionasignaturasms.domain.archivos.OtroDoc;
import com.unicauca.maestria.api.gestionasignaturasms.dtos.archivos.OtroDocCrearDto;
import com.unicauca.maestria.api.gestionasignaturasms.mappers.GenericMapper;
import org.mapstruct.InjectionStrategy;
import org.mapstruct.Mapper;

@Mapper(injectionStrategy = InjectionStrategy.CONSTRUCTOR,
        componentModel = "spring",
        uses = {DocumentoMaestriaCrearMapper.class})
public interface OtroDocCrearMapper extends GenericMapper<OtroDocCrearDto, OtroDoc> {
}
