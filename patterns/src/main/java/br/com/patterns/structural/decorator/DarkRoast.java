package br.com.patterns.structural.decorator;

import java.math.BigDecimal;

public class DarkRoast extends Beverage {
	public DarkRoast() {
		description = "Dark Roast Coffee"; 
	}

	public BigDecimal cost() { 
		return BigDecimal.valueOf(.99); 
	}
}
