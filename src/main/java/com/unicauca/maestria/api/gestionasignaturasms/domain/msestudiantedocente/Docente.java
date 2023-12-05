package com.unicauca.maestria.api.gestionasignaturasms.domain.msestudiantedocente;

import com.unicauca.maestria.api.gestionasignaturasms.common.enums.msestudiantedocente.EscalafonDocente;
import com.unicauca.maestria.api.gestionasignaturasms.common.enums.msestudiantedocente.EstadoPersona;
import com.unicauca.maestria.api.gestionasignaturasms.common.enums.msestudiantedocente.TipoVinculacion;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Data   @AllArgsConstructor
@NoArgsConstructor
@Entity @Table(name = "docentes")
public class Docente {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "id_persona")
	private Persona persona;

	@Column(unique = true)
	private String codigo;

	private String facultad;

	private String departamento;

	@Enumerated(EnumType.STRING)
	private TipoVinculacion tipoVinculacion;

	@Enumerated(EnumType.STRING)
	private EscalafonDocente escalafon;

	private String observacion;

	@Enumerated(EnumType.STRING)
	private EstadoPersona estado;

}
