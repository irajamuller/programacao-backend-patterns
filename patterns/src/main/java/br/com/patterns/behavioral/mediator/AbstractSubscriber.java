package br.com.patterns.behavioral.mediator;

public abstract class AbstractSubscriber {

	protected SocialMediaGroup mediator;
	protected String name;

	public AbstractSubscriber(SocialMediaGroup mediator, String name) {
		this.mediator = mediator;
		this.name = name;
	}

	public abstract void send(String msg);

	public abstract void receive(String msg);
}
