package com.unicauca.maestria.api.gestionasignaturasms.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.unicauca.maestria.api.gestionasignaturasms.domain.RelDocenteAsignatura;

public interface RelDocenteAsignaturaRepository extends JpaRepository<RelDocenteAsignatura, Integer> {
    
}
