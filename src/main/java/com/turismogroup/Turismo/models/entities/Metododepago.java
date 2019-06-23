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
	private Long idMpago;
		

		private String Tipopago;

		private String tipopago;

		
		private String tarjeta;
		
		private String estadoPago;
		
		private String banco;
		
		@ManyToOne(fetch=FetchType.LAZY)
		@JoinColumn(name="dui", nullable=true, unique = true)
		@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})

		private Cliente DUI;
		
		@ManyToOne(fetch=FetchType.LAZY)
		@JoinColumn(name="RutaID", nullable=true, unique = true)

		private Cliente dui;
		
		@ManyToOne(fetch=FetchType.LAZY)
		@JoinColumn(name="idRuta", nullable=true, unique = true)

		@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
		private Ruta idRuta;
		
		@ManyToOne(fetch=FetchType.LAZY)

		@JoinColumn(name="RutadetalleID", nullable=true, unique = true)
		@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
		private RutaDetalle RutadetalleID;

		@JoinColumn(name="idetalle", nullable=true, unique = true)
		@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
		private RutaDetalle idetalle;

		
}
