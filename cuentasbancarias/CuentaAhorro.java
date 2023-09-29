package cuentasbancarias;

public class CuentaAhorro extends CuentaBancarias {
    private Cliente cliente;
    private double saldo;
    private double tasaInteresAnual;

    public CuentaAhorro(Cliente cliente, double saldoInicial, double tasaInteresAnual) {
        this.cliente = cliente;
        this.saldo = saldoInicial;
        this.tasaInteresAnual = tasaInteresAnual;
    }

    @Override
    public void depositar(double cantidad) {
        if (cantidad > 0) {
            saldo += cantidad;
            System.out.println("Depósito de $" + cantidad + " realizado.");
        } else {
            System.out.println("La cantidad debe ser mayor que cero.");
        }
    }

    @Override
    public boolean retirar(double cantidad) {
        if (cantidad > 0 && saldo >= cantidad) {
            saldo -= cantidad;
            System.out.println("Retiro de $" + cantidad + " realizado.");
            return true;
        } else {
            System.out.println("No se pudo realizar el retiro.");
            return false;
        }
    }

    @Override
    public double obtenerSaldo() {
        return saldo;
    }

    // Método para calcular intereses
    public void calcularIntereses() {
        double intereses = saldo * (tasaInteresAnual / 100) / 12;
        saldo += intereses;
        System.out.println("Intereses mensuales: $" + intereses);
    }

    // Otros métodos específicos de CuentaAhorro
}
