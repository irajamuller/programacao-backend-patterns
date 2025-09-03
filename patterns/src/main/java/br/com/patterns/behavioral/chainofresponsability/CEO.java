package br.com.patterns.behavioral.chainofresponsability;

public class CEO extends Handler {

	public CEO(Handler successor) {
		super(successor);
	}
	
    @Override
    public void handleRequest(Request request) {
        System.out.println("CEOs can approve anything they want");
    }

}