package com.tuempresa.claseuml.modelo;

import java.time.*;
import java.util.*;

import javax.persistence.*;

import org.openxava.annotations.*;
import org.openxava.calculators.*;

import com.tuempresa.claseuml.modelo.calculadores.*;

import lombok.*;

@Entity @Getter @Setter
@View(name = "Vuelos", members = "numero, ciudadOrigen, ciudadDestino")
@View(members = "anyo,numero,fecha;"+
"ciudadOrigen, ciudadDestino, startTime;"+
		"tripulación;"+
"pasajeros")
public class Vuelo extends Identificable{
	
	@Column(length=4)
	 @DefaultValueCalculator(CurrentYearCalculator.class) 
	 int anyo;
	
	@ReadOnly 
	@DefaultValueCalculator(value = CalculadorDeNumeroVuelo.class, properties = @PropertyValue(name = "anyo") )
	@Column (length = 6)
	int numero;
	
	@Required
	@ManyToOne(  
			fetch=FetchType.LAZY,  
			optional=true)  
			@DescriptionsList  
			CiudadOrigen ciudadOrigen; 
	@Required
	@ManyToOne(  
			fetch=FetchType.LAZY,  
			optional=true)  
			@DescriptionsList  
			CiudadDestino ciudadDestino; 
	
	
	
	@DefaultValueCalculator(CurrentLocalDateCalculator.class) 
	LocalDate fecha;
	
 
	@StringTime
    @Column(length=33)
	//@DefaultValueCalculator(CurrentTimestampCalculator.class) 
    String startTime; 
	
	//@Required
	@ManyToOne(  
			fetch=FetchType.LAZY,  
			optional=true)  
			@DescriptionsList  
			Tripulacion tripulación;
	 
	@OneToMany  
	
	Collection<Pasajero>pasajeros;
 
}
