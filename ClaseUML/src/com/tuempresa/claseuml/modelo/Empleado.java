package com.tuempresa.claseuml.modelo;

import javax.persistence.*;

import org.openxava.annotations.*;

import lombok.*;

@Entity @Getter @Setter
public class Empleado extends Identificable{

	
	@Column(length = 64)
	@Required
	String nombres;
	
	@Column(length = 64)
	@Required
	String apellidos;
	
	 @Files @Required
	    @Column (length = 32)
	    String fotos; 

	@Required
	 @Embedded @NoFrame
		Direccion direccion;
	 //@Required
		@ManyToOne(  
				fetch=FetchType.LAZY,  
				optional=true)  
				@DescriptionsList  
				Tripulacion tripulacion;  
		
		 
}
