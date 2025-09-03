package br.com.patterns.behavioral.chainofresponsability;

public class Request {

	public enum Type {
	    CONFERENCE, PURCHASE
	}
	
	private Type type;
    private double amount;

    public Request(Type type, double amount) {
        this.type = type;
        this.amount = amount;
    }

    public Type getType() {
        return type;
    }

    public double getAmount() {
        return amount;
    }
}