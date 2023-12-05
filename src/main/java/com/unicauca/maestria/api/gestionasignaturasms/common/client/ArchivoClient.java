package com.unicauca.maestria.api.gestionasignaturasms.common.client;

import com.unicauca.maestria.api.gestionasignaturasms.dtos.archivos.*;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import javax.validation.Valid;

@FeignClient(name = "gestion-archivos-ms", url = "http://localhost:8020")
public interface ArchivoClient {

    @PostMapping("api/oficios")
    public OficioListarDto crearOficio(@RequestBody OficioCrearDto oficio);

    @PostMapping("api/otros")
    public OtroDocListarDto crearOtroDoc(@RequestBody OtroDocCrearDto otroDoc);

}
