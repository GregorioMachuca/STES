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
@Table(name="METODOSDEPAGO")
@Getter @Setter @NoArgsConstructor
public class Metododepago {
	@Id	
	private Long Mpagoid;
		
		private String Tipopago;
		
		private String Tarjeta;
		
		private String EstadoPago;
		
		private String Banco;
		
		@ManyToOne(fetch=FetchType.LAZY)
		@JoinColumn(name="dui", nullable=true, unique = true)
		@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
		private Cliente dui;
		
		@ManyToOne(fetch=FetchType.LAZY)
		@JoinColumn(name="Rutaid", nullable=true, unique = true)
		@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
		private Ruta Rutaid;
		
		@ManyToOne(fetch=FetchType.LAZY)
		@JoinColumn(name="Rutadetalleid", nullable=true, unique = true)
		@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
		private RutaDetalle Rutadetalleid;
		
}
