import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class Cliente {
    public static void main(String[] args) {
        try {
            // Localizar el registro RMI en el servidor
            Registry registry = LocateRegistry.getRegistry("localhost");

            // Buscar los proveedores en el registro RMI
            GestionCuentas proveedorRegistro = (GestionCuentas) registry.lookup("Registro");
            GestionCuentas inicioSesion = (GestionCuentas) registry.lookup("InicioSesion");
            GestionCuentas cerrarSesion = (GestionCuentas) registry.lookup("CerrarSesion");
            GestionCuentas actualizarInfo = (GestionCuentas) registry.lookup("ActualizarInfo");

            // Realizar operaciones con los proveedores
            System.out.println("Resultado del proveedor de registro: " + proveedorRegistro.registrarse("Registro"));
            System.out.println("Resultado del inicio de sesion: " + actualizarInfo.actualizarInformacion("Informacion"));
            System.out.println("Resultado de cerrar sesion: " + inicioSesion.iniciarSesion());
            System.out.println("Resultado de actualizar informacion personal: " + cerrarSesion.cerrarSesion());
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
