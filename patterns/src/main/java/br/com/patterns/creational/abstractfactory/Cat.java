package br.com.patterns.creational.abstractfactory;

public class Cat implements Animal {

	@Override
	public void makeSound() {
		System.out.println("Miau");
	}

}
