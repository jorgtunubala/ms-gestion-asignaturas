package com.unicauca.maestria.api.gestionasignaturasms.repositories;

import com.unicauca.maestria.api.gestionasignaturasms.domain.Asignatura;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface AsignaturaRepository extends JpaRepository<Asignatura, Long> {

    public boolean existsByNombreAsignatura(String nombre);
    public boolean existsByCodigoAsignatura(Long codigoAsignatura);

    @Query(
            value = "SELECT * " +
                    "FROM asignaturas a " +
                    "WHERE a.estado_asignatura = :estado",
            nativeQuery = true
    )
    public List<Asignatura> findByEstado(@Param("estado") Boolean estado);

}
