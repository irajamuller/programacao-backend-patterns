package br.com.patterns.creational;

public class SingletonTest {

	public static void main(String[] args) {
		for (int i = 0; i < 10; i++) {
			new Thread(() -> {
				System.out.println(Singleton.increment());
			}
			).start();
		}
	}
}
