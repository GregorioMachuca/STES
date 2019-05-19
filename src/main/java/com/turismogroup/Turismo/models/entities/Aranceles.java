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
@Table(name="ARANCELES")
@Getter @Setter @NoArgsConstructor
public class Aranceles {

	@Id	
	private Long IDaranceles;
		
		private String Costo_mayoresedad;
		
		private String Costo_menoresedad;
		
		private String Costo_entrada;
		
		private String Costo_hospedaje;
		
		private String Costo_grupopersonas;
		
		private String Costo_por_vehiculo;
		
		private String Costo_carroextra;
		
		@ManyToOne(fetch=FetchType.LAZY)
		@JoinColumn(name="ViajeID", nullable=true, unique = true)
		@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
		private Viaje ViajeID;
		
}
