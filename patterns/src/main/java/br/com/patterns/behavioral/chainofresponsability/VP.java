package br.com.patterns.behavioral.chainofresponsability;

public class VP extends Handler {

	public VP(Handler successor) {
		super(successor);
	}
	
	@Override
    public void handleRequest(Request request) {
        if (request.getType() == Request.Type.PURCHASE) {
            if (request.getAmount() < 1500) {
                System.out.println("VPs can approve purchases below 1500");
            } else {
                successor.handleRequest(request);
            }
        }
    }
}