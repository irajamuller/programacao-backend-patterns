package br.com.patterns.behavioral.strategy;
// Adaptado de http://www.java2s.com/Tutorials/Java/Java_Design_Patterns/0240__Java_Strategy_Pattern.htm

public class StrategyTest {

	public static void main(String[] args) {
		Context context = new Context(new OperationAdd());
		System.out.println("Add " + context.executeStrategy(5, 2));

		context = new Context(new OperationSubtract());
		System.out.println("Subtract " + context.executeStrategy(5, 2));

		context = new Context(new OperationMultiply());
		System.out.println("Multiply " + context.executeStrategy(5, 2));

		context = new Context(new OperationDivide());
		System.out.println("Divide " + context.executeStrategy(5, 2));
	}

}
