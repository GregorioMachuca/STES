package com.turismogroup.Turismo.models.entities;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="CLIENTE")
@Getter @Setter @NoArgsConstructor
public class Cliente {

	@Id	
private Long dui;
	
	private String nombre;
	
	private String numerotelefono;
	
	private String direccion;
	
	private String residencia;
	
	private String email;
	
	private String genero;
	
	private String estado;
	
<<<<<<< HEAD
	private String Tipopersona;
=======
	private String tipopersona;
>>>>>>> 5ddf8dc272ee8a54608b43f14a07cbd61d993ce0
}
