package rmi;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class NameFetchClient {
    public static void main(String[] args) throws Exception {
        Registry registry = LocateRegistry.getRegistry(2345);
        IFetchNames fetchName = (IFetchNames)registry.lookup("FetchName");
        String fullName = fetchName.fetchFullName("Tara");
        System.out.println("Full Name is "+ fullName);
    }
}
