package br.com.patterns.structural.adapter;

public class Circle implements Shape {
	public void draw() {
		System.out.println("Drawing Circle");
	}

	public void resize() {
		System.out.println("Resizing Circle");
	}

	public String show() {
		return "Circle object";
	}

	public boolean isHidden() {
		return false;
	}
}
