package rmi;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class FetchNameServer {
    public static void main(String[] args) throws Exception{
        IFetchNames fetchNames = new FetchNamesImpl();

        Registry registry = LocateRegistry.createRegistry(2345);
        registry.rebind("FetchName",fetchNames);
        System.out.println("Server is up and running....");
    }
}
