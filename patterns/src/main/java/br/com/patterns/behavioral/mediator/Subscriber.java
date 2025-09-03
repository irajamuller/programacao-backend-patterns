package br.com.patterns.behavioral.mediator;

public class Subscriber extends AbstractSubscriber {

	public Subscriber(SocialMediaGroup med, String name) {
		super(med, name);
	}

	@Override
	public void send(String msg) {
		System.out.println(this.name + ": Shared New Article on : " + msg);
		mediator.sendMessage(msg, this);
	}

	@Override
	public void receive(String msg) {
		System.out.println(this.name + ": There is new Article Available on : " + msg);
	}

	
	@Override
	public boolean equals(Object obj) {
		return name.equals(((Subscriber) obj).name);
	}
}
