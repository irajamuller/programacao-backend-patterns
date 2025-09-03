package br.com.patterns.structural.decorator;

import java.math.BigDecimal;

public class Espresso extends Beverage {

	public Espresso() { 
		description = "Espresso";
	}

	public BigDecimal cost() { 
		return BigDecimal.valueOf(1.99);
	}
}
