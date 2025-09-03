package br.com.patterns.structural.bridge;

// Adaptado de https://www.journaldev.com/1491/bridge-design-pattern-java

public class BridgeTest {

	public static void main(String[] args) {
		Shape square = new Square(new Red());
		square.applyColor();;

		Shape circle = new Circle(new Blue());
		circle.applyColor();
	}

}
