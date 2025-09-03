package br.com.patterns.behavioral.chainofresponsability;

public class ChainOfResponsibilityTest {
	public static void main(String[] args) {
		CEO ernesto = new CEO(null);
		VP mateus = new VP(ernesto);
		Director gustavo = new Director(mateus);

//		gustavo.setSuccessor(mateus);
//		mateus.setSuccessor(ernesto);
//
		Request request = new Request(Request.Type.CONFERENCE, 500);
		gustavo.handleRequest(request);

		request = new Request(Request.Type.PURCHASE, 1000);
		gustavo.handleRequest(request);
		
		request = new Request(Request.Type.PURCHASE, 2000);
		gustavo.handleRequest(request);
	}
}
