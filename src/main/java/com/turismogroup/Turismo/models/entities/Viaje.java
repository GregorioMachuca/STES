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
private Long idViaje;
	
	private String zonaturistica;
	
	private String ubicacion;
	
	private String direccion;
	
	private String horarios;
	
<<<<<<< HEAD
	private String NoTelefonolugar;
=======
	private String notelefonolugar;
>>>>>>> 5ddf8dc272ee8a54608b43f14a07cbd61d993ce0
}
