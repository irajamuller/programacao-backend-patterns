package br.com.patterns.structural.decorator;

import java.math.BigDecimal;

public class Decaf extends Beverage {
	
	public Decaf() { 
		description = "Decaf Coffee";
	}

	public BigDecimal cost() { 
		return BigDecimal.valueOf(1.05);
	}
}
