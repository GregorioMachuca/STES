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
@Table(name="RUTA_DETALLE")
@Getter @Setter @NoArgsConstructor
public class RutaDetalle {

	@Id	
private Long RutadetalleID;
	
	private String Tarifaporviaje;
	
	private String Capacidadvehiculo;
	
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="RutaID", nullable=true, unique = true)
	@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
	private Ruta RutaID;
	
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="Matricula", nullable=true, unique = true)
	@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
	private Flota Matricula;
	
	
}
