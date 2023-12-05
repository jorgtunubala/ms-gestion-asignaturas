package com.unicauca.maestria.api.gestionasignaturasms.domain.msestudiantedocente;

import lombok.*;

import javax.persistence.*;
import java.util.Objects;

@Getter @Setter @ToString   @NoArgsConstructor @AllArgsConstructor @Builder
@Entity @Table(name = "lineas_investigacion")
public class LineaInvestigacion {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String titulo;
	
	private String categoria;


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
