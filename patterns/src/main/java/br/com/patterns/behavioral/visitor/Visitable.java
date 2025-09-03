package br.com.patterns.behavioral.visitor;

public interface Visitable {
	public void accept(Visitor visitor);
}
