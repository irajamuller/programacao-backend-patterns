package br.com.patterns.creational.abstractfactory;

public interface SpeciesFactory {
	public Animal create(AnimalType animalType);
}
