package com.unicauca.maestria.api.gestionasignaturasms.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.unicauca.maestria.api.gestionasignaturasms.dtos.rest.request.AsignaturaExternaDto;
import com.unicauca.maestria.api.gestionasignaturasms.dtos.rest.response.AsignaturaExternaResponseDto;
import com.unicauca.maestria.api.gestionasignaturasms.services.rest.AsignaturaExternaService;

@RestController
@RequestMapping("api/asignaturasExternas")
public class AsignaturaExternaController {

    @Autowired
    private AsignaturaExternaService asignaturaExternaService;

    @PostMapping()
    public ResponseEntity<AsignaturaExternaResponseDto> crear(@RequestBody AsignaturaExternaDto asignaturas) {
        return ResponseEntity.status(HttpStatus.CREATED).body(asignaturaExternaService.registrarAsignaturasExternas(asignaturas));
    }

    @GetMapping("/obtener-asignatura/{idAsignatura}")
    public ResponseEntity<AsignaturaExternaResponseDto> obtenerAsignatura(@PathVariable Integer idAsignatura) {
        return ResponseEntity.status(HttpStatus.OK).body(asignaturaExternaService.obtenerAsignaturasExterna(idAsignatura));
    }
}
