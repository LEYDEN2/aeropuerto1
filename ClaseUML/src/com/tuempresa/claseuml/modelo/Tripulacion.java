package com.tuempresa.claseuml.modelo;

import java.util.*;

import javax.persistence.*;

import org.openxava.annotations.*;

import lombok.*;

@Entity @Getter @Setter
@View(members = "nombre, numElementos;"+
"aerolinea;"
		+"empleados")
public class Tripulacion extends Identificable{
	@Required
	@Column
	String nombre;
	@Required
	@Column
	int numElementos;
  
	@Required
	@ManyToOne(  
			fetch=FetchType.LAZY,  
			optional=true)  
			@DescriptionsList  
			Aerolinea aerolinea; 
	
	
	@OneToMany  
	Collection<Empleado>empleados;
		 
	
	
}
