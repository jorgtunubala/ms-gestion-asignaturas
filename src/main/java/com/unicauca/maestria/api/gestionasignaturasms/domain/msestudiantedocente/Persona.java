package com.unicauca.maestria.api.gestionasignaturasms.domain.msestudiantedocente;

import com.unicauca.maestria.api.gestionasignaturasms.common.enums.msestudiantedocente.Genero;
import com.unicauca.maestria.api.gestionasignaturasms.common.enums.msestudiantedocente.TipoIdentificacion;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;


@Data   @NoArgsConstructor @AllArgsConstructor
@Entity @Table(name = "personas")
public class Persona {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(unique = true)
	private Long identificacion;
	
	private String nombre;
	private String apellido;
	
	@Column(unique = true)
	private String correoElectronico;
	private String telefono;
	
	@Enumerated(EnumType.STRING)
	private Genero genero;
	
	@Enumerated(EnumType.STRING)
	private TipoIdentificacion tipoIdentificacion;
}
