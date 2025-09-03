package br.com.patterns.creational.prototype;

public class Horse implements Animal {
	private String name;
	
	public Horse(String name) {
		this.name = name;
	}
	
	@Override
	public Animal clone() {
		return new Horse(name);
	}

	@Override
	public String toString() {
		return hashCode() + " " + name;
	}
}
