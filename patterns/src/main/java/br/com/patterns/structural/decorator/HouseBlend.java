package br.com.patterns.structural.decorator;

import java.math.BigDecimal;

public class HouseBlend extends Beverage {
	
	public HouseBlend() { 
		description = "House Blend Coffee"; 
	}
	
	public BigDecimal cost() { 
		return BigDecimal.valueOf(.89); 
	}
}
