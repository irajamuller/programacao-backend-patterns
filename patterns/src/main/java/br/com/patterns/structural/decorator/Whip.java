package br.com.patterns.structural.decorator;

import java.math.BigDecimal;

public class Whip extends CondimentDecorator {

	public Whip(Beverage beverage) { 
		this.beverage = beverage; 
	}

	public String getDescription() {
		return beverage.getDescription() + ", Whip";
	}

	public BigDecimal cost() {
		return beverage.cost().add(BigDecimal.valueOf(.10));
	}
}
