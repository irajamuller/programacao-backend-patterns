package br.com.patterns.behavioral.strategy;

public class OperationMultiply implements CalcutorStrategy {
	@Override
	public int execute(Integer a, Integer b) {
		return a * b;
	}
}
