package br.com.patterns.behavioral.state;

public class SuperMario implements State {
	private Mario mario;
	
	public SuperMario(Mario mario) {
		this.mario = mario;
	}

	@Override
	public void gotMushroom() {
		System.out.println("Got mushroom");
		mario.gotCoins(100);
	}

	@Override
	public void gotFireFlower() {
		System.out.println("Got fireflower");
		mario.toFireMario();
		mario.gotCoins(200);
	}

	@Override
	public void gotFeather() {
		System.out.println("Got feather");
		mario.toCapeMario();
		mario.gotCoins(300);
	}

	@Override
	public void metMonster() {
		System.out.println("Met monster");
		mario.toSmallMario();
	}

	@Override
	public String toString() {
		return "Super Mario";
	}
}
