package com.tuempresa.claseuml.modelo;

 

import javax.persistence.*;

import org.openxava.annotations.*;

import lombok.*;

@Entity @Getter @Setter

public class Pasajero extends Identificable{
	@Required
	@Column
	int numeroAsiento;
	@Required
	@Money
	@Column(length = 32)
	float precio;
	 
	@Required
	@OneToOne 
	@ReferenceView("simple")//*************
	Persona persona;
	
	 //@Required
	@ManyToOne(  
			fetch=FetchType.LAZY,  
			optional=true)  
 @ReferenceView("Vuelos") 
			Vuelo vuelo;  
	
	
}
