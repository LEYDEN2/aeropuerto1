package com.tuempresa.aeropuerto.modelo;

import javax.persistence.*;
import javax.persistence.Entity;

import org.hibernate.annotations.*;
import org.openxava.annotations.*;

import lombok.*;

@Entity @Setter @Getter
public class Puesto {

	@Id
	@Hidden
	@GeneratedValue(generator = "system-uuid")
	@GenericGenerator(name="system-uuid", strategy = "uuid")
	@Column(length = 32)
	String oid;
	
	@Column(length = 20)
	@Required
	String descripcion;
}
