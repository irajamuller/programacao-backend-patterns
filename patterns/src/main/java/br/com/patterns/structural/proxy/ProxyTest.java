package br.com.patterns.structural.proxy;

// Adaptado de https://www.tutorialspoint.com/design_pattern/proxy_pattern.htm

public class ProxyTest {

	public static void main(String[] args) {
		Image image1 = new ProxyImage("c:/temp/gremio.png");
		Image image2 = new ProxyImage("c:/temp/inter.png");

		image1.display();
		image1.display();
		image2.display();
		image2.display();
		image1.display();
	}

}
