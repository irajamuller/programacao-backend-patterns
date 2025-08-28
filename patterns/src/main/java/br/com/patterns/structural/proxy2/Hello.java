package br.com.patterns.structural.proxy2;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface Hello extends Remote {
    public String sayHello() throws RemoteException;
}