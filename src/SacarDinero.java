class SacarDinero extends Thread {
    private Cuenta cuenta;
    private String persona;
    private float cantidad;

    public SacarDinero(Cuenta cuenta, String persona, float cantidad) {
        this.cuenta = cuenta;
        this.persona = persona;
        this.cantidad = cantidad;
    }

    public void run() {
        cuenta.sacarDinero(persona, cantidad);
    }
}
