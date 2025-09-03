package br.com.patterns.behavioral.visitor;

import java.math.BigDecimal;

public class PostageVisitor implements Visitor {
	private BigDecimal total = BigDecimal.ZERO;
	
	@Override
	public void visit(Book book) {
		// Free postage for a book over 50
		if (book.getPrice().compareTo(new BigDecimal(50)) <= 0) {
			total = total.add(new BigDecimal(10)); 
		}
	}
	// Others visitors here
	
	public BigDecimal getTotal() { return total; }
}
