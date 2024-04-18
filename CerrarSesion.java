import java.rmi.*;
import java.rmi.server.*;

class CerrarSesion extends UnicastRemoteObject implements GestionCuentas {
    public CerrarSesion() throws RemoteException {
        super();
    }

    public String registrarse(String registro) throws RemoteException {
        return "Operación no disponible en este proveedor";        
    }

    public String iniciarSesion() throws RemoteException {
        return "Operacion no disponible en este proveedor";
    }

    public String cerrarSesion() throws RemoteException {
        return "Cerrando Sesion .....";
    }

    public String actualizarInformacion(String informacion) throws RemoteException {
        return "Operación no disponible en este proveedor";
    }
}
