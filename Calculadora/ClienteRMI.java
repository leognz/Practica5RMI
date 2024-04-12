import java.rmi.Naming;

public class ClienteRMI {
    public static void main(String[] args) {
        try {
            float numero1 = Float.valueOf(args[0]);
            float numero2 = Float.valueOf(args[1]);

            Servicios servicio = (Servicios) Naming.lookup("rmi://localhost/Servicios");
            Float suma1 = servicio.suma(numero1, numero2);
            Float resta1 = servicio.resta(numero1, numero2);
            Float multiplicacion1 = servicio.multiplicacion(numero1, numero2);
            Float division1 = servicio.division(numero1, numero2);
            System.out.println(suma1);
            System.out.println(resta1);
            System.out.println(multiplicacion1);
            System.out.println(division1);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
