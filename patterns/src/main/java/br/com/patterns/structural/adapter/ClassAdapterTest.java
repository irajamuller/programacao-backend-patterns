package br.com.patterns.structural.adapter;

// Adaptado de https://dzone.com/articles/adapter-design-pattern-in-java

public class ClassAdapterTest {

	public static void main(String[] args) {

		System.out.println("Creating drawing of shapes...");

		DrawingApplication drawingApp = new DrawingApplication();

		drawingApp.addShape(new Rectangle());
		drawingApp.addShape(new Circle());
		drawingApp.addShape(new TriangleAdapter());
		drawingApp.addShape(new RhombusAdapter());

		System.out.println("Drawing...");
		drawingApp.draw();
		System.out.println("Resizing...");
		drawingApp.resize();


	}

}
