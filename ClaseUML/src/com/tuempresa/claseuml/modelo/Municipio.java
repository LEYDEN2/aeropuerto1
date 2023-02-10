package com.tuempresa.claseuml.modelo;

import javax.persistence.*;

import lombok.*;

@Entity @Getter @Setter
public class Municipio extends Identificable {
	
	String descripcion;
}
