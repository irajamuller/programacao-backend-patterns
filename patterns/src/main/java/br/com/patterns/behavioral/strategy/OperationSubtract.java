package br.com.patterns.behavioral.strategy;

public class OperationSubtract implements CalcutorStrategy {
	@Override
	public int execute(Integer a, Integer b) {
		return a - b;
	}
}
