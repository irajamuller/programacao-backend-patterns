package br.com.patterns.structural.proxy;

public class RealImage implements Image {
	private String file;
	
	public RealImage(String file) {
		this.file = file;
		System.out.println("Loading image from disk " + file);
	}
	
	@Override
	public void display() {
		System.out.println("Displaying image " + file);
	}

}
