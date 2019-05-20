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
	private Long idaranceles;
		
		private String costomayoresedad;
		
		private String costomenoresedad;
		
		private String costoentrada;
		
		private String costohospedaje;
		
		private String costogrupopersonas;
		
		private String costoporvehiculo;
		
		private String costocarroextra;
		
		@ManyToOne(fetch=FetchType.LAZY)
		@JoinColumn(name="idviaje", nullable=true, unique = true)
		@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
		private Viaje idviaje;
		
}
