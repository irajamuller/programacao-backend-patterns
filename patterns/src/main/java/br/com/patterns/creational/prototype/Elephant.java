package br.com.patterns.creational.prototype;

public class Elephant implements Animal {
	private String name;
	
	public Elephant(String name) {
		this.name = name;
	}
	
	@Override
	public Animal clone() {
		return new Elephant(name);
	}

	@Override
	public String toString() {
		return hashCode() + " " + name;
	}
}
