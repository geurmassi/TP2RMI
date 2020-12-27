import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class Server extends UnicastRemoteObject implements MyInterface {

    public Server() throws RemoteException {}
    private double solde;

    public String debit(double y){
        if (solde<10)
        {
            return "solde insuffisant";
        }
        else {
            solde=solde-y;
            return "solde debité";
        }
    }
    public String credit (double y) {
        solde=solde+y;
        return "solde credité";
    }
    public double lireSolde()
    {
        return solde;
    }
    public static void main(String[] args) throws RemoteException, MalformedURLException {
        Server server = new Server();

        java.rmi.registry.LocateRegistry.createRegistry(1250);

        Naming.rebind("rmi://127.0.0.1:1250/server", server);
    }
}
