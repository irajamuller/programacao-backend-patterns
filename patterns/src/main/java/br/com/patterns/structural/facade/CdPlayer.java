/*
 * Adaptado de "Head First Design Patterns"
 * https://github.com/bethrobson/Head-First-Design-Patterns
 */

package br.com.patterns.structural.facade;

public class CdPlayer {
	private String description;
	private int currentTrack;
	private Amplifier amplifier;
	private String title;
	
	public CdPlayer(String description, Amplifier amplifier) {
		this.description = description;
		this.amplifier = amplifier;
	}
 
	public void on() {
		System.out.println(description + " ligado");
	}
 
	public void off() {
		System.out.println(description + " desligado");
	}

	public void eject() {
		title = null;
		System.out.println(description + " ejetado");
	}
 
	public void play(String title) {
		this.title = title;
		currentTrack = 0;
		System.out.println(description + " tocando \"" + title + "\"");
	}

	public void play(int track) {
		if (title == null) {
			System.out.println(description + " não pode tocar a música " + currentTrack + 
					", não há CD inserido");
		} else {
			currentTrack = track;
			System.out.println(description + " tocando a música " + currentTrack);
		}
	}

	public void stop() {
		currentTrack = 0;
		System.out.println(description + " parado");
	}
 
	public void pause() {
		System.out.println(description + " pausado \"" + title + "\"");
	}
 
	public String toString() {
		return description;
	}
}
