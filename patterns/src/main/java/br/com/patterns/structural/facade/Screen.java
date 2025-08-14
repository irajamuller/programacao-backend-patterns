/*
 * Adaptado de "Head First Design Patterns"
 * https://github.com/bethrobson/Head-First-Design-Patterns
 */

package br.com.patterns.structural.facade;

public class Screen {
	private String description;

	public Screen(String description) {
		this.description = description;
	}

	public void up() {
		System.out.println(description + " subindo");
	}

	public void down() {
		System.out.println(description + " descendo");
	}


	public String toString() {
		return description;
	}
}
