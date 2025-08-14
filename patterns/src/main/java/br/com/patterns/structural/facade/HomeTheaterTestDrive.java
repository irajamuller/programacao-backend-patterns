package br.com.patterns.structural.facade;

// Adaptado de "Head First Design Patterns" https://github.com/bethrobson/Head-First-Design-Patterns

public class HomeTheaterTestDrive {
	public static void main(String[] args) {
		 HomeTheaterFacade.getInstance().watchMovie("Deadpool 2");
		 HomeTheaterFacade.getInstance().endMovie();
	}
}
