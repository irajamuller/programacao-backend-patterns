package br.com.patterns.behavioral.mediator;

// Adaptado de http://www.codenuclear.com/mediator-design-pattern-in-java/

public class SocilalMediaGroupTest {

	public static void main(String[] args) {
		SocialMediaGroup mediator = new LearnAndShareGroup();

		Subscriber subscriber1 = new Subscriber(mediator, "John");
		Subscriber subscriber2 = new Subscriber(mediator, "Smith");
		Subscriber subscriber3 = new Subscriber(mediator, "Greg");
		Subscriber subscriber4 = new Subscriber(mediator, "Devin");

		mediator.addSubscriber(subscriber1);
		mediator.addSubscriber(subscriber2);
		mediator.addSubscriber(subscriber3);
		mediator.addSubscriber(subscriber4);

		subscriber1.send("Learn Design Patterns.");
		
		mediator.removeSubscriber(subscriber4);
		subscriber1.send("Learn Design Patterns Again.");
		
	}

}
