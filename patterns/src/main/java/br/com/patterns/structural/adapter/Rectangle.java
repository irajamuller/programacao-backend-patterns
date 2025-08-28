package br.com.patterns.structural.adapter;

public class Rectangle implements Shape {
	public void draw() {
		 System.out.println("Drawing Rectangle");
	}

	public void resize() {
		System.out.println("Resizing Rectangle");
	}

	public String show() {
		return "Rectangle object";
	}

	public boolean isHidden() {
		return false;
	}
}
