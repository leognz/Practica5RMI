import java.rmi.*;
import java.rmi.server.*;

class ProveedorRegistro extends UnicastRemoteObject implements GestionCuentas {
    public ProveedorRegistro() throws RemoteException {
        super();
    }

    public String registrarse(String registro) throws RemoteException {
        return "Registro exitoso " + registro;
    }

    public String iniciarSesion() throws RemoteException {
        return "Operación no disponible en este proveedor";
    }

    public String cerrarSesion() throws RemoteException {
        return "Operación no disponible en este proveedor";
    }

    public String actualizarInformacion(String informacion) throws RemoteException {
        return "Operación no disponible en este proveedor";
    }
}
