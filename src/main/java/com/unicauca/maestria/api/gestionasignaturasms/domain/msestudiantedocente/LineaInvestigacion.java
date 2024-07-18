package com.unicauca.maestria.api.gestionasignaturasms.domain.msestudiantedocente;

import lombok.*;

import javax.persistence.*;

import com.unicauca.maestria.api.gestionasignaturasms.common.enums.msestudiantedocente.EstadoPersona;

import java.util.Objects;

@Getter @Setter @ToString @AllArgsConstructor @Builder
@Entity @Table(name = "lineas_investigacion")
public class LineaInvestigacion {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String descripcion;

	@ManyToOne
	@JoinColumn(name = "id_categoria")
	private CategoriaLinea categoria;

	@Enumerated(EnumType.STRING)
	private EstadoPersona estado;

	public LineaInvestigacion() {
		estado = EstadoPersona.ACTIVO;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		LineaInvestigacion other = (LineaInvestigacion) obj;
		return Objects.equals(id, other.id);
	}
	
	
}
