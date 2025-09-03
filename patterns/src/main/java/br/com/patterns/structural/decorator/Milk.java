package br.com.patterns.structural.decorator;

import java.math.BigDecimal;

public class Milk extends CondimentDecorator {

	public Milk(Beverage beverage) { 
		this.beverage = beverage;
	}

	public String getDescription() { 
		return beverage.getDescription() + ", Milk"; 
	}

	public BigDecimal cost() { 
		return beverage.cost().add(BigDecimal.valueOf(.10)); 
	}
}
