package rmi;

import java.io.Serializable;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class FetchNamesImpl extends UnicastRemoteObject implements IFetchNames , Serializable {

    protected FetchNamesImpl() throws RemoteException {
        super();
    }

    @Override
    public String fetchFullName(String firstName) throws RemoteException {
        String names[] = {"Tara Sharma","Peter Pan","John Snow","John Doe"};
        String fullName = "";
        for(String name : names) {
            if(name.startsWith(firstName)){
                fullName = name;
                break;
            }
        }

        return fullName;
    }


}
