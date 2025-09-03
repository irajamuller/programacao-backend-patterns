package br.com.patterns.structural.decorator;

import java.math.BigDecimal;

public class Mocha extends CondimentDecorator {

	public Mocha(Beverage beverage) { 
		this.beverage = beverage; 
	}

	public String getDescription() {
		return beverage.getDescription() + ", Mocha"; 
	}

	public BigDecimal cost() {
		return beverage.cost().add(BigDecimal.valueOf(.20)); 
	}
}
