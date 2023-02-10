package com.tuempresa.aeropuerto.modelo;

import javax.persistence.*;

import lombok.*;

@Embeddable @Getter @Setter
public class Direccion {


	@Column(length = 30)
	String Calle;
	
	@Column(length = 20)
	String colonia;
	
	@Column(length = 30)
	String Ciudad;
	
	@Column(length = 30)
	String Pais;
}
