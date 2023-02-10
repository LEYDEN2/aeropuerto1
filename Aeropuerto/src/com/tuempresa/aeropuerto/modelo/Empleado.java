package com.tuempresa.aeropuerto.modelo;

import javax.persistence.*;

import org.openxava.annotations.*;

import lombok.*;


@Entity @Getter @Setter
public class Empleado {
@Id 
	
	@Column(length=6) 
	String id;
	@Column(length=50)  
	@Required 
	String nombre;
	
	//@ManyToOne(fetch = FetchType.LAZY, optional = true)
	//@DescriptionsList
	//Puesto puesto;
	
	//@ManyToOne(fetch = FetchType.LAZY, optional = true)
	//@DescriptionsList
	//Aerolinea aerolinea;
	
}
