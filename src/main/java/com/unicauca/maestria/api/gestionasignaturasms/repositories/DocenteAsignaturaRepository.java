package com.unicauca.maestria.api.gestionasignaturasms.repositories;

import com.unicauca.maestria.api.gestionasignaturasms.domain.Asignatura;
import com.unicauca.maestria.api.gestionasignaturasms.domain.DocenteAsignatura;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface DocenteAsignaturaRepository extends JpaRepository<DocenteAsignatura, Long> {

    @Query(
            value = "SELECT * " +
                    "FROM docentes_asignaturas da " +
                    "WHERE da.dicta_asignatura = :estado",
            nativeQuery = true
    )
    public List<DocenteAsignatura> findByEstado(@Param("estado") Boolean estado);
}
