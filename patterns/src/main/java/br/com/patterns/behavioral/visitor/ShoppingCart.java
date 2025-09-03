package br.com.patterns.behavioral.visitor;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
	private List<Visitable> items = new ArrayList<>();

	public void add(Visitable visitable) { items.add(visitable); }
	
	public BigDecimal calculatePostage() {
		PostageVisitor visitor = new PostageVisitor();
		for (Visitable each : items) {
			each.accept(visitor);
		}
		
		return visitor.getTotal();
	}
	
}
