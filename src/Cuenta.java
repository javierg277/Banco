class Cuenta {
    private float saldo;

    public Cuenta(float saldoInicial) {
        this.saldo = saldoInicial;
    }

    public synchronized float obtenerSaldo() {
        try {
            Thread.sleep(500); // Simulación de operación lenta del cajero
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return saldo;
    }

    public synchronized void ingresarDinero(String persona, float cantidad) {
        float saldoInicial = saldo;
        System.out.println(persona + " está ingresando $" + cantidad);
        saldo += cantidad;
        System.out.println("Estado inicial del saldo antes de ingresar por " + persona + ": $" + saldoInicial);
        System.out.println("Saldo después del ingreso por " + persona + ": $" + saldo);
    }

    public synchronized void sacarDinero(String persona, float cantidad) {
        float saldoInicial = saldo;
        if (saldo > 0) {
            if (saldo >= cantidad) {
                System.out.println(persona + " está sacando $" + cantidad);
                saldo -= cantidad;
                System.out.println(persona + " ha retirado $" + cantidad);
                System.out.println("Saldo después de retirar por " + persona + ": $" + saldo);
            } else {
                System.out.println("Saldo insuficiente para " + persona + " para retirar $" + cantidad);
            }
        } else {
            System.out.println("La cuenta tiene saldo 0");
        }
    }
}

