package br.com.patterns.behavioral.strategy;

public class Context {
	private CalcutorStrategy strategy;
	
	public Context(CalcutorStrategy strategy) {
		this.strategy = strategy;
	}
	
	public int executeStrategy(int a, int b) {
		return strategy.execute(a, b);
	}
}
