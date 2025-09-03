package br.com.patterns.behavioral.command2;

public class Test {

	public static void main(String[] args) {
		Runnable r = new Runnable() {
			@Override
			public void run() {
				System.out.println("Executando algo...");
			}
		};
		
		new Thread(r).start();
	}

}
