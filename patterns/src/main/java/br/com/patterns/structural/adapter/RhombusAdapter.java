package br.com.patterns.structural.adapter;

public class RhombusAdapter extends Rhombus implements Shape {

	public RhombusAdapter() {
		super();
	}

	public RhombusAdapter(double a, double b) {
		super(a, b);
	}

	@Override
	public void draw() {
		this.drawShape();
	}

	@Override
	public void resize() {
		System.out.println("Rhombus can't be resized. Please create new one with required values.");

	}

	@Override
	public String show() {
		return "Rhombus object";
	}

	@Override
	public boolean isHidden() {
		return false;
	}

}
