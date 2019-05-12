package com.turismogroup.Turismo.models.entities;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="Viaje")
@Getter @Setter @NoArgsConstructor
public class Viaje {

	@Id	
private Long ViajeID;
	
	private String ZonaTuristica;
	
	private String Ubicacion;
	
	private String Direccion;
	
	private String Horarios;
	
	private String No_Telefono_lugar;
}
