package br.com.patterns.creational.abstractfactory;

public class AbstractFactory {
	public static SpeciesFactory create(SpeciesType speciesType) {
		switch (speciesType) {
			case MAMMAL: return new MammalFactory();
			case REPTILE: return new ReptileFactory();
			default: return null;
		}
	}
}
