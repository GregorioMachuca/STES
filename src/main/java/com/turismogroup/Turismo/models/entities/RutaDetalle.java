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
private Long rutadetalleid;
	
	private String tarifaporviaje;
	
	private String capacidadvehiculo;
	
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="rutaid", nullable=true, unique = true)
	@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
	private Ruta rutaid;
	
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="matricula", nullable=true, unique = true)
	@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
	private Flota matricula;
}
