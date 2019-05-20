package com.turismogroup.Turismo.models.entities;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="VIAJE")
@Getter @Setter @NoArgsConstructor
public class Viaje {

	@Id	
private Long idviaje;
	
	private String zonaturistica;
	
	private String ubicacion;
	
	private String direccion;
	
	private String horarios;
	
	private String notelefonolugar;
}
