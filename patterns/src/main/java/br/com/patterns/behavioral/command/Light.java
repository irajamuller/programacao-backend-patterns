package br.com.patterns.behavioral.command;

// Fonte: https://github.com/icoderman/gof-design-patterns/blob/master/src/main/java/com/icoderman/behavioral/command/example1/Light.java

// Receiver
public class Light {
	private boolean isOn = false;

	public void toggle() {
		if (isOn) off(); 
		else 	  on(); 
		isOn = !isOn;
	}

	private void on() {
		System.out.println("Light switched On.");
	}

	private void off() {
		System.out.println("Light switched Off.");
	}
}
