package com.unicauca.maestria.api.gestionasignaturasms.mappers.archivos;

import com.unicauca.maestria.api.gestionasignaturasms.domain.archivos.Oficio;
import com.unicauca.maestria.api.gestionasignaturasms.dtos.archivos.OficioCrearDto;
import com.unicauca.maestria.api.gestionasignaturasms.mappers.GenericMapper;
import org.mapstruct.InjectionStrategy;
import org.mapstruct.Mapper;

@Mapper(injectionStrategy = InjectionStrategy.CONSTRUCTOR,
        componentModel = "spring",
        uses = {DocumentoMaestriaCrearMapper.class})
public interface OficioCrearMapper extends GenericMapper<OficioCrearDto, Oficio> {
}
