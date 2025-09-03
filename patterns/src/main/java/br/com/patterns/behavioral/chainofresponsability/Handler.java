package br.com.patterns.behavioral.chainofresponsability;

public abstract class Handler {

    protected Handler successor;

	public Handler(Handler successor) {
		this.successor = successor;
	}
    
    public void setSuccessor(Handler successor) {
        this.successor = successor;
    }

    public abstract void handleRequest(Request request);
}