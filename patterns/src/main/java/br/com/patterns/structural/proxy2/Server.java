package br.com.patterns.structural.proxy2;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;

/* Instrucoes para Windows
	javac -d c:/temp Hello.java Server.java Client.java
	rmiregistry (dentro do c:/temp)
	java -classpath c:/temp -Djava.rmi.server.codebase=file:c:/temp br.edu.unisinos.dev2.patterns.proxy2.Server
	java -classpath c:/temp br.edu.unisinos.dev2.patterns.proxy2.Client
*/

// Adaptado de https://docs.oracle.com/javase/7/docs/technotes/guides/rmi/hello/hello-world.html
public class Server implements Hello {
    public String sayHello() {
        return "Hello, world!";
    }
    public static void main(String args[]) {
        try {
            Server obj = new Server();
            Hello stub = (Hello) UnicastRemoteObject.exportObject(obj, 0);

            Registry registry = LocateRegistry.getRegistry();
            registry.bind("Hello", stub);

            System.err.println("Server ready");
        } catch (Exception e) {
            System.err.println("Server exception: " + e.toString());
            e.printStackTrace();
        }
    }
}