package br.com.patterns.creational.abstractfactory;

// Adaptado de https://javarevealed.wordpress.com/2013/08/12/abstract-factory-design-pattern/
public class AnimalTest {

	public static void main(String[] args) {
		SpeciesFactory mammalFactory = AbstractFactory.create(SpeciesType.MAMMAL);
		SpeciesFactory reptileFactory = AbstractFactory.create(SpeciesType.REPTILE);
		
		Animal cat = mammalFactory.create(AnimalType.CAT); cat.makeSound();
		Animal dog = mammalFactory.create(AnimalType.DOG); dog.makeSound();
		Animal snake = reptileFactory.create(AnimalType.SNAKE); snake.makeSound();
		Animal crocodile = reptileFactory.create(AnimalType.CROCODILE); crocodile.makeSound();
	}

}
