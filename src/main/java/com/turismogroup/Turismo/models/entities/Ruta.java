package com.turismogroup.Turismo.models.entities;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="RUTA")
@Getter @Setter @NoArgsConstructor
public class Ruta {

	@Id	
	private Long Rutaid;
		
		private String DireccionSalida;
		
		private String Kilometraje;
		
		@ManyToOne(fetch=FetchType.LAZY)
		@JoinColumn(name="Viajeid", nullable=true, unique = true)
		@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
		private Viaje Viajeid;
		
		private String HoraSalida;
		
		private String HoraLlegada;
		
		private String Fecha;
		
		private String Disponibilidad;
		
		@ManyToOne(fetch=FetchType.LAZY)
		@JoinColumn(name="dui", nullable=true, unique = true)
		@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
		private Cliente dui;
		
		private String AsientoPersonas;
}
