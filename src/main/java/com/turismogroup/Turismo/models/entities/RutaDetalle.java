package com.turismogroup.Turismo.models.entities;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="RUTADETALLE")
@Getter @Setter @NoArgsConstructor
public class RutaDetalle {

	@Id	
private Long RutadetalleID;
	
	private String Tarifa_por_viaje;
	
	private String Capacidad_vehiculo;
	
	private String RutaID;
	
	private String Matricula;
	
}
