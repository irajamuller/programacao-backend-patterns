package br.com.patterns.structural.decorator;

import java.math.BigDecimal;

public abstract class Beverage {

	protected String description = "Unknown Beverage";

	public String getDescription() { 
		return description; 
	}

	public abstract BigDecimal cost();
}
