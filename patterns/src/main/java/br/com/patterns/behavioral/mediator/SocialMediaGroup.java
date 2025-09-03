package br.com.patterns.behavioral.mediator;

public interface SocialMediaGroup {
	
	public void sendMessage(String msg, Subscriber user);
	
	public void addSubscriber(Subscriber user);
	
	public void removeSubscriber(Subscriber user);
}
