package br.com.patterns.structural.adapter;

import java.util.ArrayList;
import java.util.List;

public class DrawingApplication {

	private List<Shape> shapes = new ArrayList<Shape>();

	public void addShape(Shape shape) {
		shapes.add(shape);
	}

	public List<Shape> getShapes() {
		return new ArrayList<Shape>(shapes);
	}

	public void draw() {
		for (Shape shape : getShapes()) {
			shape.draw();
		}
	}

	public void resize() {
		for (Shape shape : getShapes()) {
			shape.resize();
		}
	}
}
