package br.com.patterns.behavioral.observer;

import java.util.List;

public class Commentary implements Subject {

	private List<Observer> observers;
	private String desc;
	private String subjectDetails;
	
	public Commentary(List<Observer> observers, String subjectDetails){
		this.observers = observers;
		this.subjectDetails = subjectDetails;
	}
	
	@Override
	public void subscribeObserver(Observer observer) {	
		observers.add(observer);
	}

	@Override
	public void unSubscribeObserver(Observer observer) {
		observers.remove(observer);
	}

	@Override
	public void notifyObservers() {
		System.out.println();
		for(Observer observer : observers){
			observer.update(desc);
		}
	}

	@Override
	public String subjectDetails() {
		return subjectDetails;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
		notifyObservers();
	}
	
	
	
}
