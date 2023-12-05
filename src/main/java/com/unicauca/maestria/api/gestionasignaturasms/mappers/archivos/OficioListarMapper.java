package com.unicauca.maestria.api.gestionasignaturasms.mappers.archivos;

import com.unicauca.maestria.api.gestionasignaturasms.domain.archivos.Oficio;
import com.unicauca.maestria.api.gestionasignaturasms.dtos.archivos.OficioListarDto;
import com.unicauca.maestria.api.gestionasignaturasms.mappers.GenericMapper;
import org.mapstruct.InjectionStrategy;
import org.mapstruct.Mapper;

@Mapper(injectionStrategy = InjectionStrategy.CONSTRUCTOR, componentModel = "spring")
public interface OficioListarMapper extends GenericMapper<OficioListarDto, Oficio> {
}
