package com.unicauca.maestria.api.gestionasignaturasms.dtos;

import javax.validation.constraints.NotBlank;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class LineaInvestigacionDto {

    private Long id;

    @NotBlank
    private String titulo;

    @NotBlank
    private String categoria;
}

