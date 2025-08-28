package br.com.patterns.behavioral.iterator;

import java.util.ArrayList;
import java.util.List;

public class Zoo<E> implements Aggregate<E> {
	private List<E> items;
	
	public Zoo() {
		items = new ArrayList<>();
	}
	
	@Override
	public void add(E element) {
		if (items.contains(element)) 
			throw new IllegalArgumentException("The element is already in the list!");
		items.add(element);
	}

	@Override
	public void remove(E element) {
		if (!items.contains(element)) 
			throw new IllegalArgumentException("The element was not found in the list!");
		items.remove(element);
	}

	@Override
	public Iterator<E> createIterator() {
		return new Iterator<E>() {
			private int current;
			
			@Override
			public boolean hasNext() {
				return current < items.size();
			}
			@Override
			public E next() {
				if (!hasNext()) throw new IndexOutOfBoundsException();
				return items.get(current++);
			}
		};
	}
}