import java.rmi.*;
import java.rmi.server.*;

interface GestionCuentas extends Remote {
    String registrarse(String registro) throws RemoteException;
    String iniciarSesion() throws RemoteException;
    String cerrarSesion() throws RemoteException;
    String actualizarInformacion(String informacion) throws RemoteException;
}
