/*
 * Adaptado de "Head First Design Patterns"
 * https://github.com/bethrobson/Head-First-Design-Patterns
 */

package br.com.patterns.structural.facade;

public class TheaterLights {
	private String description;

	public TheaterLights(String description) {
		this.description = description;
	}

	public void on() {
		System.out.println(description + " ligadas");
	}

	public void off() {
		System.out.println(description + " desligadas");
	}

	public void dim(int level) {
		System.out.println(description + " escurecendo para " + level  + "%");
	}

	public String toString() {
		return description;
	}
}
