class IngresarDinero extends Thread {
    private Cuenta cuenta;
    private String persona;
    private float cantidad;

    public IngresarDinero(Cuenta cuenta, String persona, float cantidad) {
        this.cuenta = cuenta;
        this.persona = persona;
        this.cantidad = cantidad;
    }

    public void run() {
        cuenta.ingresarDinero(persona, cantidad);
    }
}
