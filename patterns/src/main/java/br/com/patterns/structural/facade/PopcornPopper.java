/*
 * Adaptado de "Head First Design Patterns"
 * https://github.com/bethrobson/Head-First-Design-Patterns
 */

package br.com.patterns.structural.facade;

public class PopcornPopper {
	private String description;
	
	public PopcornPopper(String description) {
		this.description = description;
	}
 
	public void on() {
		System.out.println(description + " ligado");
	}
 
	public void off() {
		System.out.println(description + " desligado");
	}

	public void pop() {
		System.out.println(description + " fazendo pipoca!");
	}
 
  
        public String toString() {
                return description;
        }
}
