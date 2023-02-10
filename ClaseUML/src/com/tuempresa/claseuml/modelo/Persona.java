package com.tuempresa.claseuml.modelo;

import javax.persistence.*;

import org.openxava.annotations.*;

import lombok.*;
 

@Entity @Getter @Setter
@View (name =  "simple",members  = "datos {"+    
		"nombres;"+
		"apellidos"+
     "}" )
public class Persona extends Identificable{

	
	
	@Column(length = 64)
	@Required
	String nombres;
	@Required
	@Column(length = 64)
	
	String apellidos;
	
	
	 @Files @Required
	    @Column (length = 32)
	    String fotos; 

	@Required
	 @Embedded @NoFrame
		Direccion direccion;
	 

}
