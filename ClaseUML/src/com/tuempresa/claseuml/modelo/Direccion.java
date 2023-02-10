package com.tuempresa.claseuml.modelo;

import javax.persistence.*;

import org.openxava.annotations.*;

import lombok.*;

@Embeddable @Getter @Setter
public class Direccion {
	@Required
	@Column(length = 30)
	String viaPublica;
	@Required
	@Column (length = 5)
	int CodigoPostal;
	@Required
	@ManyToOne(  
			fetch=FetchType.LAZY, 
			optional=true)  
			@DescriptionsList  
			Municipio municipio;  
	@Required
	@Column(length = 30)
	String provincia;
	@Required
	@ManyToOne(  
			fetch=FetchType.LAZY, 
			optional=true) 
			@DescriptionsList  
			Pais pais;  
	
}
