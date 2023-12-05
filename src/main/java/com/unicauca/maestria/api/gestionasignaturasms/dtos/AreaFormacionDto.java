package com.unicauca.maestria.api.gestionasignaturasms.dtos;

import lombok.*;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class AreaFormacionDto {

    @NotNull
    @Size(min = 1, max = 70)
    private String nombre;

    @NotNull
    @Size(min = 1, max = 200)
    private String descripcion;
}
