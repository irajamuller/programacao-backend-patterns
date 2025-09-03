package br.com.patterns.behavioral.visitor;

import java.math.BigDecimal;

// Adaptado de https://dzone.com/articles/design-patterns-visitor

public class ShoppingCartTest {

	public static void main(String[] args) {
		ShoppingCart shoppingCart = new ShoppingCart();
		shoppingCart.add(new Book(new BigDecimal(129.90), new BigDecimal(0.6)));
		shoppingCart.add(new Book(new BigDecimal(49.90), new BigDecimal(1.2)));
		
		System.out.println(shoppingCart.calculatePostage());
	}

}
