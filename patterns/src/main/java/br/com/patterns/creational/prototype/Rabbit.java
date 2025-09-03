package br.com.patterns.creational.prototype;

public class Rabbit implements Animal {
	private String name;
	
	public Rabbit(String name) {
		this.name = name;
	}

	@Override
	public Animal clone() {
		return new Rabbit(name);
	}

	@Override
	public String toString() {
		return hashCode() + " " + name;
	}
}
