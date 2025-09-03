package br.com.patterns.creational.prototype;

// Adaptado de https://stackabuse.com/creational-design-patterns-in-java/

public class AnimalTest {

	public static void main(String[] args) {
		Animal rabbit = (Animal) new Rabbit("Rabbit");
		System.out.println("source: " + rabbit + " clone: " + rabbit.clone());
		
		Animal horse = new Horse("Horse");
		System.out.println("source: " + horse + " clone: " + horse.clone());

		Animal elephant = new Elephant("Elephant");
		System.out.println("source: " + elephant + " clone: " + elephant.clone());
		
	}

}
