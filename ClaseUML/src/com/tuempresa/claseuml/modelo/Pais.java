package com.tuempresa.claseuml.modelo;

import javax.persistence.*;

import lombok.*;

@Entity @Getter @Setter
public class Pais extends Identificable{
	
	
	String descripcion;
}
