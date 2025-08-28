package br.com.patterns.creational.abstractfactory;

public class Dog implements Animal {

	@Override
	public void makeSound() {
		System.out.println("Uau");
	}

}
