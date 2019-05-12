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
	private Long Matricula;
	
	private String Marca;
	
	private String Modelo;
	
	private String Capacidad;
	
	private String Combustible;
	
	private String Tipo_vehiculo;
	
	private String Estado;
	
	private String Tarifa_kilometro;
	
	
	
}
