package com.turismogroup.Turismo.models.entities;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="CLIENTE")
@Getter @Setter @NoArgsConstructor
public class Cliente {

	@Id	
private Long DUI;
	
	private String Nombre;
	
	private String NumeroTelefono;
	
	private String Direccion;
	
	private String Residencia;
	
	private String Email;
	
	private String Genero;
	
	private String Estado;
	
	private String Tipopersona;
}
