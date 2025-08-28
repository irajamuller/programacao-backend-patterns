package br.com.patterns.creational.abstractfactory;

public class MammalFactory implements SpeciesFactory {

	@Override
	public Animal create(AnimalType animalType) {
		switch (animalType) {
			case CAT: return new Cat();
			case DOG: return new Dog();
			default: return null;
		}
	}

}
