package br.com.patterns.behavioral.iterator;

public interface Aggregate<E> {
	public void add(E element);
	public void remove(E element);
	public Iterator<E> createIterator(); 
}
