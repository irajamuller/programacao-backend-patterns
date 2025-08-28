package br.com.patterns.creational.factory;

public abstract class AbstractShapeFactory {
	public enum Type {CIRCLE, RECTANGLE, TRIANGLE};
	
	public abstract Shape create(Type type);
}
