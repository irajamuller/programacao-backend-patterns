package br.com.patterns.behavioral.state;

public class Mario {
	private static final int BONUS = 5_000;

	private int lifes;
	private int coins;
	private State state;

	private SmallMario smallMario;
	private SuperMario superMario;
	private FireMario fireMario;
	private CapeMario capeMario;

	public Mario() {
		lifes = 1;
		smallMario = new SmallMario(this);
		superMario = new SuperMario(this);
		fireMario = new FireMario(this);
		capeMario = new CapeMario(this);
		state = smallMario;
	}

	public void gotMushroom() {
		state.gotMushroom();
	}

	public void gotFireFlower() {
		state.gotFireFlower();
	}

	public void gotFeather() {
		state.gotFeather();
	}

	public void metMonster() {
		state.metMonster();
	}

	public void gotCoins(int coins) {
		this.coins += coins;
		System.out.printf("Got %d coin(s)\n", coins);
		if (this.coins >= BONUS) {
			gotLife();
			this.coins -= BONUS;
		}
	}

	public void gotLife() {
		System.out.println("Got life!");
		lifes++;
	}

	public void lostLife() {
		System.out.println("Lost life!");
		lifes--;
		if (lifes < 1)
			gameOver();
	}

	public void gameOver() {
		lifes = coins = 0;
		System.out.println("Game over!");
		System.exit(0);
	}

	public void toSuperMario() {
		state = superMario;
	}

	public void toFireMario() {
		state = fireMario;
	}

	public void toCapeMario() {
		state = capeMario;
	}

	public void toSmallMario() {
		state = smallMario;
	}

	@Override
	public String toString() {
		return String.format("State %s Lifes (%d) Coins (%d)", state, lifes, coins);
	}
}
