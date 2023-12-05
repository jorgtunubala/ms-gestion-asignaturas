package com.unicauca.maestria.api.gestionasignaturasms.domain.msestudiantedocente;

import com.unicauca.maestria.api.gestionasignaturasms.common.enums.msestudiantedocente.AbreviaturaTitulo;
import com.unicauca.maestria.api.gestionasignaturasms.common.enums.msestudiantedocente.CategoriaMinCiencia;
import lombok.*;

import javax.persistence.*;
import java.util.Objects;

@Setter @Getter @ToString @NoArgsConstructor @AllArgsConstructor
@Entity @Table(name = "titulos")
public class Titulo {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Enumerated(EnumType.STRING)
	private AbreviaturaTitulo abreviatura;
	
	@Enumerated(EnumType.STRING)
	private CategoriaMinCiencia categoriaMinCiencia;

	private String universidad;
	
	private String linkCvLac;

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Titulo other = (Titulo) obj;
		return Objects.equals(id, other.id);
	}


	
	
}
