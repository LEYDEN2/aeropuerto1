package com.tuempresa.aeropuerto.modelo;

import javax.persistence.*;

import org.openxava.annotations.*;

import lombok.*;


@Entity @Getter @Setter
public class Pasajero {
@Id 
	
	@Column(length=6) 
	String id;
	@Column(length=50)  
	@Required 
	String nombre;

	@Embedded 
	Direccion direccion;
	
}
