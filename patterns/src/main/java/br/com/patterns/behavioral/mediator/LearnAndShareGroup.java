package br.com.patterns.behavioral.mediator;

import java.util.ArrayList;
import java.util.List;

public class LearnAndShareGroup implements SocialMediaGroup {

	private List<Subscriber> subscribers;

	public LearnAndShareGroup() {
		this.subscribers = new ArrayList<>();
	}

	@Override
	public void sendMessage(String msg, Subscriber user) {
		for (Subscriber subscriber : subscribers) {
			if (subscriber != user) {
				subscriber.receive(msg);
			}
		}
	}

	@Override
	public void addSubscriber(Subscriber user) {
		this.subscribers.add(user);
	}
	
	@Override
	public void removeSubscriber(Subscriber user) {
		subscribers.remove(user);
	}
}
