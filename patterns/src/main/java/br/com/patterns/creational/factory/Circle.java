package br.com.patterns.creational.factory;

import java.util.Iterator;

public class Circle extends Shape implements Iterable<Circle> {
	@Override
	public void draw() {
		System.out.println("Drawing circle...");
	}
	
	@Override
	public Iterator<Circle> iterator() {
		return new Iterator<Circle>() {
			
			@Override
			public Circle next() {
				return null;
			}
			
			@Override
			public boolean hasNext() {
				return false;
			}
		};
	}
}
