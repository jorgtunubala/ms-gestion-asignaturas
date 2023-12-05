package com.unicauca.maestria.api.gestionasignaturasms.exceptions;

import java.util.Map;


import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class FieldUniqueException extends RuntimeException {

    private static final long serialVersionUID = 1L;
    private Map<String, String> informacionCamposUnicos;

    public FieldUniqueException(Map<String, String> informacionCamposUnicos) {

        this.informacionCamposUnicos = informacionCamposUnicos;
    }


}
