import java.rmi.Remote;
import java.rmi.RemoteException;

public interface MyInterface extends Remote {

    double lireSolde()throws RemoteException;
    String credit(double y)throws RemoteException;
    String debit(double y)throws RemoteException;
}
