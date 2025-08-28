package br.com.patterns.behavioral.state;

// Adaptado de https://www.c-sharpcorner.com/article/understanding-state-design-pattern-by-implementing-finite-state/

public class MarioTest {
	public static void main(String[] args) {
		Mario mario = new Mario();
		System.out.println(mario);

		mario.gotMushroom();  
		System.out.println(mario);
  
        mario.gotFireFlower();  
		System.out.println(mario);
  
        mario.gotFeather();  
		System.out.println(mario);
  
        mario.gotCoins(4800);  
		System.out.println(mario);
  
        mario.metMonster();  
		System.out.println(mario);
  
        mario.metMonster();  
		System.out.println(mario);
  
        mario.metMonster();  
		System.out.println(mario);
	}
}
