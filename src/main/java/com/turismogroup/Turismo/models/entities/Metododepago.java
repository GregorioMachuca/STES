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
@Table(name="Metodosdepago")
@Getter @Setter @NoArgsConstructor
public class Metododepago {
	@Id	
	private Long MPagoID;
		
		private String Tipo_pago;
		
		private String Tarjeta;
		
		private String EstadoPago;
		
		private String Banco;
		
		@ManyToOne(fetch=FetchType.LAZY)
		@JoinColumn(name="DUI", nullable=true, unique = true)
		@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
		private Ruta DUI;
		
		@ManyToOne(fetch=FetchType.LAZY)
		@JoinColumn(name="ruta_id", nullable=true, unique = true)
		@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
		private Ruta ruta;
		
		/*@ManyToOne(fetch=FetchType.LAZY)
		@JoinColumn(name="RutadetalleId", nullable=true, unique = true)
		@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
		private Ruta rutadetalle;*/
		
}
