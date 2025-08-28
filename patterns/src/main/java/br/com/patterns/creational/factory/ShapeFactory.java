package br.com.patterns.creational.factory;

public class ShapeFactory extends AbstractShapeFactory {
	@Override
	public Shape create(Type type) {
		Shape shape = null;
		switch (type) {
		case CIRCLE: shape = new Circle(); break;
		case RECTANGLE: shape = new Rectangle(); break;
		case TRIANGLE: shape = new Triangle(); break;
		}

		return shape;
	}
}
