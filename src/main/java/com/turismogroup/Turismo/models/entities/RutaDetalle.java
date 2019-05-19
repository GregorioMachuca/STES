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
@Table(name="RUTADETALLE")
@Getter @Setter @NoArgsConstructor
public class RutaDetalle {

	@Id	
private Long Rutadetalleid;
	
	private String Tarifaporviaje;
	
	private String Capacidadvehiculo;
	
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="Rutaid", nullable=true, unique = true)
	@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
	private Ruta Rutaid;
	
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="Matricula", nullable=true, unique = true)
	@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
	private Flota Matricula;
}
