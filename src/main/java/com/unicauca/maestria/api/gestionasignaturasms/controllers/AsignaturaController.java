package com.unicauca.maestria.api.gestionasignaturasms.controllers;

import com.unicauca.maestria.api.gestionasignaturasms.domain.ActaAsignatura;
import com.unicauca.maestria.api.gestionasignaturasms.domain.Asignatura;
import com.unicauca.maestria.api.gestionasignaturasms.domain.DocenteAsignatura;
import com.unicauca.maestria.api.gestionasignaturasms.dtos.AsignaturaCrearDto;
import com.unicauca.maestria.api.gestionasignaturasms.dtos.AsignaturaListarDto;
import com.unicauca.maestria.api.gestionasignaturasms.services.asignatura.AsignaturaService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("/api/asignaturas")
@CrossOrigin(origins = "*", methods= {RequestMethod.GET,RequestMethod.POST, RequestMethod.PUT})
public class AsignaturaController {

    private final AsignaturaService service;

    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<AsignaturaListarDto> crear(@Valid @RequestBody AsignaturaCrearDto asignatura, BindingResult result) {
        return ResponseEntity.status(HttpStatus.CREATED).body(service.crear(asignatura, result));
    }

    @GetMapping
    public ResponseEntity<List<AsignaturaListarDto>> listarTodo(){
        return ResponseEntity.status(HttpStatus.OK).body(service.buscarTodo());
    }

    @GetMapping("/estado/{estado}")
    public ResponseEntity<List<AsignaturaListarDto>> listarTodoPorEstado(@PathVariable Boolean estado){
        return ResponseEntity.status(HttpStatus.OK).body(service.buscarTodoPorEstado(estado));
    }

    @GetMapping("/{id}")
    public ResponseEntity<AsignaturaListarDto> buscarPorId(@PathVariable Long id){
        return ResponseEntity.status(HttpStatus.OK).body(service.buscarPorId(id));
    }

    @GetMapping("/codigo/{codigo}")
    public ResponseEntity<Boolean> existCodigo(@PathVariable Long codigo){
        return ResponseEntity.status(HttpStatus.OK).body(service.existCodigo(codigo));
    }

    @GetMapping("/nombre/{nombre}")
    public ResponseEntity<Boolean> existNombre(@PathVariable String nombre){
        return ResponseEntity.status(HttpStatus.OK).body(service.existNombre(nombre));
    }

    @GetMapping("/completa/{id}")
    public ResponseEntity<Asignatura> buscarPorIdCompleta(@PathVariable Long id){
        return ResponseEntity.status(HttpStatus.OK).body(service.buscarPorIdCompleto(id));
    }

    @PutMapping("/{id}")
    public ResponseEntity<AsignaturaListarDto> editarAsignatura(@PathVariable Long id, @Valid @RequestBody AsignaturaCrearDto asignatura, BindingResult result){
        return ResponseEntity.status(HttpStatus.OK).body(service.editar(id, asignatura, result));
    }

    @GetMapping("/actas/{estado}")
    public ResponseEntity<List<ActaAsignatura>> actasAsignaturas(@PathVariable Boolean estado){
        return ResponseEntity.status(HttpStatus.OK).body(service.getActasAsignaturasByEstado(estado));
    }

    @GetMapping("/docentes/{estado}")
    public ResponseEntity<List<DocenteAsignatura>> docentesAsignaturas(@PathVariable Boolean estado){
        return ResponseEntity.status(HttpStatus.OK).body(service.getDocentesAsignaturasByEstado(estado));
    }
}
