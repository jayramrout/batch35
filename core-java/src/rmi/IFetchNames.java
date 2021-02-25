package rmi;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface IFetchNames extends Remote {
    String fetchFullName(String firstName) throws RemoteException;
//    String[] fetchAllFullName(String firstName) throws RemoteException;
//
//    Name fetchNameObject(String fname) throws RemoteException;
//    Name[] fetchNameObjects(String fname) throws RemoteException;
//

}
