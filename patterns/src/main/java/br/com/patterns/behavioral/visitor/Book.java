package br.com.patterns.behavioral.visitor;

import java.math.BigDecimal;

public class Book implements Visitable {
	private BigDecimal price;
	private BigDecimal weight;

	public Book(BigDecimal price, BigDecimal weight) {
		this.price = price;
		this.weight = weight;
	}
	
	@Override
	public void accept(Visitor visitor) {
		visitor.visit(this);
	}
	
	public BigDecimal getPrice() { return price; }
	public BigDecimal getWeight() { return weight; }

}
