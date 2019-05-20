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
	private Long matricula;
	
	private String marca;
	
	private String modelo;
	
	private String capacidad;
	
	private String combustible;
	
	private String tipovehiculo;
	
	private String estado;
	
	private String tarifakilometro;
	
	
	
}
