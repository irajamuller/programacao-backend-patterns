package br.com.patterns.behavioral.observer;

import java.util.ArrayList;

// Adaptado de https://www.javacodegeeks.com/2015/09/observer-design-pattern.html

public class ObserverTest {

	public static void main(String[] args) {
		Commentary subject = new Commentary(new ArrayList<Observer>(), "Grenal 418 [23/10/2018]");
		Observer observer = new SMSUsers(subject, "Gustavo [S�o Leopoldo]");
		observer.subscribe();
		System.out.println();
		Observer observer2 = new SMSUsers(subject, "Gilberto [Novo Hamburgo]");
		observer2.subscribe();
		subject.setDesc("Bem-vindos ao GreNal 418!");
		subject.setDesc("O placar atual � 0x0");
		System.out.println();
		observer2.unSubscribe();
		System.out.println();
		subject.setDesc("Gol do Gr�mio!");
		subject.setDesc("O placar �: Gremio 1 - Inter 0");
		System.out.println();
		Observer observer3 = new SMSUsers(subject, "Jo�o [Porto Alegre]");
		observer3.subscribe();
		System.out.println();
		subject.setDesc("Mais um gol do Gr�mio!");
		subject.setDesc("O placar �: Gr�mio 2 - Inter 0");
	}

}