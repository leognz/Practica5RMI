import java.rmi.*;
import java.rmi.registry.Registry;
import java.rmi.registry.LocateRegistry;

public class ServidorGestion {
    public static void main(String args[]) {
        try {
            // Crear los proveedores
            ProveedorRegistro proveedorRegistro = new ProveedorRegistro();
            InicioSesion inicioSesion = new InicioSesion();
            CerrarSesion cerrarSesion = new CerrarSesion();
            ActualizarInfo actualizarInfo = new ActualizarInfo();

            // Registrar los proveedores en el registro RMI
            String direccionIP = "localhost"; // Cambiar a la dirección IP del servidor si es necesario
            int puertoRMI = 1099; // Puerto RMI predeterminado
            String rutaRegistro = "//" + direccionIP + ":" + puertoRMI + "/Registro";
            String rutaIniciarSesion = "//" + direccionIP + ":" + puertoRMI + "/InicioSesion";
            String rutaCerrarSesion = "//" + direccionIP + ":" + puertoRMI + "/CerrarSesion";
            String rutaActualizarInfo = "//" + direccionIP + ":" + puertoRMI + "/ActualizarInfo";


  Registry registry = LocateRegistry.createRegistry(1099);




            Naming.rebind(rutaRegistro, proveedorRegistro);
            Naming.rebind(rutaIniciarSesion, inicioSesion);
            Naming.rebind(rutaCerrarSesion, cerrarSesion);
            Naming.rebind(rutaActualizarInfo, actualizarInfo);

            System.out.println("Servidores listos");
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
