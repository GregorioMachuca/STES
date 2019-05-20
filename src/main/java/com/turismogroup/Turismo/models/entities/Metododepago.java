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
	private Long mpagoid;
		
		private String tipopago;
		
		private String tarjeta;
		
		private String estadoPago;
		
		private String banco;
		
		@ManyToOne(fetch=FetchType.LAZY)
		@JoinColumn(name="dui", nullable=true, unique = true)
		@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
		private Cliente dui;
		
		@ManyToOne(fetch=FetchType.LAZY)
		@JoinColumn(name="rutaid", nullable=true, unique = true)
		@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
		private Ruta rutaid;
		
		@ManyToOne(fetch=FetchType.LAZY)
		@JoinColumn(name="rutadetalleid", nullable=true, unique = true)
		@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
		private RutaDetalle rutadetalleid;
		
}
