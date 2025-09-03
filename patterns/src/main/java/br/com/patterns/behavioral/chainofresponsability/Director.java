package br.com.patterns.behavioral.chainofresponsability;

public class Director extends Handler {

	public Director(Handler successor) {
		super(successor);
	}
	
    @Override
    public void handleRequest(Request request) {
        if (request.getType() == Request.Type.CONFERENCE) {
            System.out.println("Directors can approve conferences");
        } else {
            successor.handleRequest(request);
        }
    }

}