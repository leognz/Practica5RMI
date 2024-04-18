import java.rmi.*;
import java.rmi.server.*;

class InicioSesion extends UnicastRemoteObject implements GestionCuentas {
    public InicioSesion() throws RemoteException {
        super();
    }

    public String registrarse(String registro) throws RemoteException {
        return "Operación no disponible en este proveedor";        
    }

    public String iniciarSesion() throws RemoteException {
        return "Inicio de sesion exitosa";
    }

    public String cerrarSesion() throws RemoteException {
        return "Operación no disponible en este proveedor";
    }

    public String actualizarInformacion(String informacion) throws RemoteException {
        return "Operación no disponible en este proveedor";
    }
}
