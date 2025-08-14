/*
 * Adaptado de "Head First Design Patterns"
 * https://github.com/bethrobson/Head-First-Design-Patterns
 */

package br.com.patterns.structural.facade;

public class Tuner {
	private String description;
	private Amplifier amplifier;
	private double frequency;

	public Tuner(String description, Amplifier amplifier) {
		this.description = description;
	}

	public void on() {
		System.out.println(description + " ligado");
	}

	public void off() {
		System.out.println(description + " desligado");
	}

	public void setFrequency(double frequency) {
		System.out.println(description + " ajustando frequencia para " + frequency);
		this.frequency = frequency;
	}

	public void setAm() {
		System.out.println(description + " ajustado para modo AM");
	}

	public void setFm() {
		System.out.println(description + " ajustado para modo FM");
	}

	public String toString() {
		return description;
	}
}
