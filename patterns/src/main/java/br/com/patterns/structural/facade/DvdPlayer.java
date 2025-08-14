/*
 * Adaptado de "Head First Design Patterns"
 * https://github.com/bethrobson/Head-First-Design-Patterns
 */

package br.com.patterns.structural.facade;

public class DvdPlayer {
	private String description;
	private int currentTrack;
	private Amplifier amplifier;
	private String movie;
	
	public DvdPlayer(String description, Amplifier amplifier) {
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
		movie = null;
                System.out.println(description + " ejetado");
        }
 
	public void play(String movie) {
		this.movie = movie;
		currentTrack = 0;
		System.out.println(description + " tocando \"" + movie + "\"");
	}

	public void play(int track) {
		if (movie == null) {
			System.out.println(description + " não pode tocar o filme " + track + " não há DVD inserido");
		} else {
			currentTrack = track;
			System.out.println(description + " tocnado o capítulo " + currentTrack + " de \"" + movie + "\"");
		}
	}

	public void stop() {
		currentTrack = 0;
		System.out.println(description + " parado \"" + movie + "\"");
	}
 
	public void pause() {
		System.out.println(description + " pausado \"" + movie + "\"");
	}

	public void setTwoChannelAudio() {
		System.out.println(description + " áudio ajustado para dois canais");
	}
 
	public void setSurroundAudio() {
		System.out.println(description + " áudio ajustado para surround");
	}
 
	public String toString() {
		return description;
	}
}
