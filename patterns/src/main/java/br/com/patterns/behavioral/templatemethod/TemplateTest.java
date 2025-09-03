package br.com.patterns.behavioral.templatemethod;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class TemplateTest {
	public static void main(String[] args) {
		System.out.println("Web Order: ");
		OrderTemplate webOrder = new WebOrder();
		webOrder.processOrder();

		System.out.println("Store Order: ");
		OrderTemplate storeOrder = new StoreOrder();
		storeOrder.processOrder();
		
		List<String> items = new ArrayList<>();
		items.add("Gr�mio");
		items.add("Inter");
		items.add("Caxias");
	}
}
