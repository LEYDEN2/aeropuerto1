package com.tuempresa.claseuml.modelo.calculadores;

import javax.persistence.*;

import org.openxava.calculators.*;
import org.openxava.jpa.*;

import lombok.*;

public class CalculadorNumeroDeElementosParaTripulacion implements ICalculator{

	@Getter @Setter
	 int anyo;  
	 public Object calculate() throws Exception {  
		 Query query = XPersistence.getManager()  
				 .createQuery("select max(f.numElementos) from Tripulacion f where f.anyo = :anyo");
	
	query.setParameter("anyo", anyo); 
	 
	Integer ultimoNumero = (Integer) query.getSingleResult();
	 return ultimoNumero == null ? 1 : ultimoNumero + 1;  
	 
	 
	 }
}
