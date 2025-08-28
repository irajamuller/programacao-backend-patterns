package br.com.patterns.creational.factory;

import java.util.ArrayList;
import java.util.List;

import br.com.patterns.creational.factory.AbstractShapeFactory.Type;

// Adaptado de https://www.tutorialspoint.com/design_pattern/factory_pattern.htm

public class ShapeTest {
	public static void main(String[] args) {
		AbstractShapeFactory factory = new ShapeFactory();
		Shape shape  = factory.create(Type.CIRCLE);
		shape.draw();
		shape  = factory.create(Type.RECTANGLE);
		shape.draw();
		shape  = factory.create(Type.TRIANGLE);
		shape.draw();
		
		List<Shape> circulos = new ArrayList<>();
		circulos.add(factory.create(Type.CIRCLE));
		
		for (Shape each : circulos) {
			System.err.println(each);
		}
	}
}
