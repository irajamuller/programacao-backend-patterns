package br.com.patterns.structural.adapter;

public class GeometricShapeObjectAdapter implements Shape {

	private GeometricShape adaptee;

	public GeometricShapeObjectAdapter(GeometricShape adaptee) {
		super();
		this.adaptee = adaptee;
	}

	@Override
	public void draw() {
		adaptee.drawShape();
	}

	@Override
	public void resize() {
		System.out.println(show() + " can't be resized. Please create new one with required values.");
	}

	@Override
	public String show() {
		if (adaptee instanceof Triangle) {
			return "Triangle object";
		} else if (adaptee instanceof Rhombus) {
			return "Rhombus object";
		} else {
			return "Unknown object";
		}
	}

	@Override
	public boolean isHidden() {
		return false;
	}

}
