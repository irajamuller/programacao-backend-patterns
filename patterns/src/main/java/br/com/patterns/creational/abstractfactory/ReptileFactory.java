package br.com.patterns.creational.abstractfactory;

public class ReptileFactory implements SpeciesFactory {
	@Override
	public Animal create(AnimalType animalType) {
		switch (animalType) {
			case SNAKE: return new Snake();
			case CROCODILE: return new Crocodile();
			default: return null;
		}
	}
}
