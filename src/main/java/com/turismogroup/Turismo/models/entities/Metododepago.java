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
@Table(name="METODOS_DE_PAGO")
@Getter @Setter @NoArgsConstructor
public class Metododepago {
	@Id	
	private Long MPagoID;
		
		private String Tipopago;
		
		private String Tarjeta;
		
		private String EstadoPago;
		
		private String Banco;
		
		@ManyToOne(fetch=FetchType.LAZY)
		@JoinColumn(name="DUI", nullable=true, unique = true)
		@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
		private Cliente DUI;
		
		@ManyToOne(fetch=FetchType.LAZY)
		@JoinColumn(name="RutaID", nullable=true, unique = true)
		@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
		private Ruta RutaID;
		
		@ManyToOne(fetch=FetchType.LAZY)
		@JoinColumn(name="RutadetalleID", nullable=true, unique = true)
		@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
		private RutaDetalle RutadetalleID;
		
}
