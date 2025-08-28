package br.com.patterns.behavioral.iterator;

public class Animal {
	private Long id;
	private String name;
	
	public Animal(Long id, String name) {
		this.id = id;
		this.name = name;
	}
	
	@Override
	public boolean equals(Object obj) {
		return id.equals(((Animal) obj).id);
	}
	
	@Override
	public String toString() {
		return name;
	}
}
