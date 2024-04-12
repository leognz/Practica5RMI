import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class ServidorOperaciones extends UnicastRemoteObject implements Servicios 
{
    public ServidorOperaciones() throws RemoteException 
    {
        super();
    }

    public Float suma(float x, float y) throws RemoteException 
    {
        System.out.println("Funcion suma ejecutada remotamente. Se devuelve la suma");
        return x+y;
    }

    
    public Float resta(float x, float y) throws RemoteException 
    {
        System.out.println("Funcion resta ejecutada remotamente. Se devuelve la resta");
        return x-y;
    }

    
    public Float multiplicacion(float x, float y) throws RemoteException 
    {
      System.out.println("Funcion multiplicacion ejecutada remotamente. Se devuelve la multiplicacion");
      return x*y;
    }

    
    public Float division(float x, float y) throws RemoteException 
    {
        System.out.println("Funcion division ejecutada remotamente. Se devuelve la division");
        return x/y;
    }
}
