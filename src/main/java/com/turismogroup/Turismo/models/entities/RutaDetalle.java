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
<<<<<<< HEAD
@Table(name="RUTA_DETALLE")
=======
@Table(name="RUTADETALLE")
>>>>>>> 5ddf8dc272ee8a54608b43f14a07cbd61d993ce0
@Getter @Setter @NoArgsConstructor
public class RutaDetalle {

	@Id	
<<<<<<< HEAD
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
	
=======
private Long idetalle;
	
	private String tarifaporviaje;
	
	private String capacidadvehiculo;
	
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="idRuta", nullable=true, unique = true)
	@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
	private Ruta idRuta;
>>>>>>> 5ddf8dc272ee8a54608b43f14a07cbd61d993ce0
	
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="idMatricula", nullable=true, unique = true)
	@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
	private Flota idMatricula;
}
