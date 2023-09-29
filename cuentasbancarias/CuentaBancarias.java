package cuentasbancarias;

public abstract class CuentaBancarias {
    public abstract void depositar(double cantidad);

    public abstract boolean retirar(double cantidad);

    public abstract double obtenerSaldo();

    // Interfaz para definir métodos comunes de cuentas bancarias
    public interface CuentaBancaria {
        void depositar(double cantidad);
        boolean retirar(double cantidad);
        double obtenerSaldo();
    }
}
