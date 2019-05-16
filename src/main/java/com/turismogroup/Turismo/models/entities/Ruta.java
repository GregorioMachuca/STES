package com.turismogroup.Turismo.models.entities;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="Metodosdepago")
@Getter @Setter @NoArgsConstructor
public class Ruta {

	@Id	
	private Long RutaID;
		
		private String DireccionSalida;
		
		private String Kilometraje;
		
		private String ViajeID;
		
		private String HoraSalida;
		
		private String HoraLlegada;
		
		private String Fecha;
		
		private String Disponibilidad;
		
		private String DUI;
		
		private String Asiento_Personas;
}
