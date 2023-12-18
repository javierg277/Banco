public class Ejecutable {
    public static void main(String[] args) {
        Cuenta cuenta = new Cuenta(1000);

        Thread[] transacciones = new Thread[5];
        transacciones[0] = new SacarDinero(cuenta, "Persona1", 300);
        transacciones[1] = new SacarDinero(cuenta, "Persona2", 500);
        transacciones[2] = new IngresarDinero(cuenta, "Persona3", 200);
        transacciones[3] = new IngresarDinero(cuenta, "Persona4", 400);
        transacciones[4] = new SacarDinero(cuenta, "Persona5", 800);

        for (Thread transaccion : transacciones) {
            transaccion.start();
        }
    }
}
