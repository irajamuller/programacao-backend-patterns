/*
 * Adaptado de "Head First Design Patterns"
 * https://github.com/bethrobson/Head-First-Design-Patterns
 */

package br.com.patterns.structural.facade;

public class Projector {
	private String description;
	private DvdPlayer dvdPlayer;
	
	public Projector(String description, DvdPlayer dvdPlayer) {
		this.description = description;
		this.dvdPlayer = dvdPlayer;
	}
 
	public void on() {
		System.out.println(description + " ligado");
	}
 
	public void off() {
		System.out.println(description + " desligado");
	}

	public void wideScreenMode() {
		System.out.println(description + " em mode widescreen (16x9 aspect ratio)");
	}

	public void tvMode() {
		System.out.println(description + " em modo TV (4x3 aspect ratio)");
	}
  
        public String toString() {
                return description;
        }
}
