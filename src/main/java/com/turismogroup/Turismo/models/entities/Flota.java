package com.turismogroup.Turismo.models.entities;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="FLOTA")
@Getter @Setter @NoArgsConstructor
public class Flota {

	@Id
	private Long idMatricula;
	
	private String marca;
	
	private String modelo;
	
	private String capacidad;
	
	private String combustible;
	
<<<<<<< HEAD
	private String Tipovehiculo;
=======
	private String tipovehiculo;
>>>>>>> 5ddf8dc272ee8a54608b43f14a07cbd61d993ce0
	
	private String estado;
	
<<<<<<< HEAD
	private String Tarifakilometro;
=======
	private String tarifakilometro;
>>>>>>> 5ddf8dc272ee8a54608b43f14a07cbd61d993ce0
	
	
	
}
