package br.com.patterns.behavioral.iterator;

import java.util.ArrayList;
import java.util.List;

// Adaptado de https://javapapers.com/design-patterns/iterator-design-pattern/

public class ZooTest {

	public static void main(String[] args) {
		List<Animal> zoo2 = new ArrayList<>();
		
		Aggregate<Animal> zoo = new Zoo<>();
		zoo.add(new Animal(1L, "Cat"));
		zoo.add(new Animal(2L, "Dog"));
		zoo.add(new Animal(3L, "Snake"));

		Iterator<Animal> iterator = zoo.createIterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}

}
