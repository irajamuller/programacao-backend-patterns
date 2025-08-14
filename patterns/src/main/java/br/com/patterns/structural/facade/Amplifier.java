/*
 * Adaptado de "Head First Design Patterns"
 * https://github.com/bethrobson/Head-First-Design-Patterns
 */

package br.com.patterns.structural.facade;

public class Amplifier {
	private String description;
	private Tuner tuner;
	private DvdPlayer dvd;
	private CdPlayer cd;
	
	public Amplifier(String description) {
		this.description = description;
	}
 
	public void on() {
		System.out.println(description + " ligado");
	}
 
	public void off() {
		System.out.println(description + " desligado");
	}
 
	public void setStereoSound() {
		System.out.println(description + " modo estéreo ligado");
	}
 
	public void setSurroundSound() {
		System.out.println(description + " som surround ligado (5 auto falantes, 1 subwoofer)");
	}
 
	public void setVolume(int level) {
		System.out.println(description + " setando o volume para " + level);
	}

	public void setTuner(Tuner tuner) {
		System.out.println(description + " ajustando o sintonizador para " + dvd);
		this.tuner = tuner;
	}
  
	public void setDvd(DvdPlayer dvd) {
		System.out.println(description + " ajustando o DVD player para " + dvd);
		this.dvd = dvd;
	}
 
	public void setCd(CdPlayer cd) {
		System.out.println(description + " ajustando o CD player para " + cd);
		this.cd = cd;
	}
 
	public String toString() {
		return description;
	}
}
