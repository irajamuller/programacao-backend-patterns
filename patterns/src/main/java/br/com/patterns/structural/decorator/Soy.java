package br.com.patterns.structural.decorator;

import java.math.BigDecimal;

public class Soy extends CondimentDecorator {

	public Soy(Beverage beverage) { 
		this.beverage = beverage; 
	}

	public String getDescription() {
		return beverage.getDescription() + ", Soy";
	}

	public BigDecimal cost() {
		return beverage.cost().add(BigDecimal.valueOf(.15));
	}
}
