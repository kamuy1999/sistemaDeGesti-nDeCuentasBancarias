// Paquete
package cuentasbancarias;

public class CuentaCorriente extends CuentaBancarias {
    private Cliente cliente;
    private double saldo;

    public CuentaCorriente(Cliente cliente, double saldoInicial) {
        this.cliente = cliente;
        this.saldo = saldoInicial;
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

    // Otros métodos específicos de CuentaCorriente
}



