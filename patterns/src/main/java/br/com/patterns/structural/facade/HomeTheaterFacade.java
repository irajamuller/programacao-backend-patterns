/*
 * Adaptado de "Head First Design Patterns"
 * https://github.com/bethrobson/Head-First-Design-Patterns
 */

package br.com.patterns.structural.facade;

public class HomeTheaterFacade {
	private volatile static HomeTheaterFacade instance;

	private Amplifier amp;
	private Tuner tuner;
	private DvdPlayer dvd;
	private CdPlayer cd;
	private Projector projector;
	private TheaterLights lights;
	private Screen screen;
	private PopcornPopper popper;

	public static HomeTheaterFacade getInstance() {
		if (instance == null) {
			synchronized (HomeTheaterFacade.class) {
				if (instance == null) {
					Amplifier amp = new Amplifier("Amplificador");
					Tuner tuner = new Tuner("R�dio AM/FM", amp);
					DvdPlayer dvd = new DvdPlayer("DVD Player", amp);
					CdPlayer cd = new CdPlayer("CD Player", amp);
					Projector projector = new Projector("Projetor", dvd);
					TheaterLights lights = new TheaterLights("Luzes do Teto");
					Screen screen = new Screen("Tela de Proje��o");
					PopcornPopper popper = new PopcornPopper("Pipoqueira");
					instance = new HomeTheaterFacade(amp, tuner, dvd, cd, projector, screen, lights, popper);
				}
			}
		}
		return instance;
	}

	private HomeTheaterFacade(Amplifier amp, Tuner tuner, DvdPlayer dvd, CdPlayer cd, Projector projector,
							  Screen screen, TheaterLights lights, PopcornPopper popper) {
		this.amp = amp;
		this.tuner = tuner;
		this.dvd = dvd;
		this.cd = cd;
		this.projector = projector;
		this.screen = screen;
		this.lights = lights;
		this.popper = popper;
	}

	public void watchMovie(String movie) {
		System.out.println("Se prepare para assistir a um filme...");
		popper.on();
		popper.pop();
		lights.dim(10);
		screen.down();
		projector.on();
		projector.wideScreenMode();
		amp.on();
		amp.setDvd(dvd);
		amp.setSurroundSound();
		amp.setVolume(5);
		dvd.on();
		dvd.play(movie);
	}

	public void endMovie() {
		System.out.println("Desligando o home theater...");
		popper.off();
		lights.on();
		screen.up();
		projector.off();
		amp.off();
		dvd.stop();
		dvd.eject();
		dvd.off();
	}

	public void listenToCd(String cdTitle) {
		System.out.println("Se prepare para ouvir música...");
		lights.on();
		amp.on();
		amp.setVolume(5);
		amp.setCd(cd);
		amp.setStereoSound();
		cd.on();
		cd.play(cdTitle);
	}

	public void endCd() {
		System.out.println("Desligando o CD player...");
		amp.off();
		amp.setCd(cd);
		cd.eject();
		cd.off();
	}

	public void listenToRadio(double frequency) {
		System.out.println("Ligando o rádio...");
		tuner.on();
		tuner.setFrequency(frequency);
		amp.on();
		amp.setVolume(5);
		amp.setTuner(tuner);
	}

	public void endRadio() {
		System.out.println("Desligando o rádio...");
		tuner.off();
		amp.off();
	}
}
