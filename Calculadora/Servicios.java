import java.rmi.Remote;
import java.rmi.RemoteException;

public interface Servicios extends Remote 
{
    Float suma(float x, float y) throws RemoteException;
    Float resta(float x, float y) throws RemoteException;
    Float multiplicacion(float x, float y) throws RemoteException;
    Float division(float x, float y) throws RemoteException;
}
