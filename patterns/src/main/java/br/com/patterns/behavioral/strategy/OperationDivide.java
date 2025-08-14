package br.com.patterns.behavioral.strategy;

public class OperationDivide implements CalcutorStrategy {
	@Override
	public int execute(Integer a, Integer b) {
		return a / b;
	}
}
