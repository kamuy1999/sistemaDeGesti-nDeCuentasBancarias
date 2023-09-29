//paquete
import cuentasbancarias.Cliente;
import cuentasbancarias.CuentaAhorro;
import cuentasbancarias.CuentaBancarias;
import cuentasbancarias.CuentaCorriente;

import java.util.Scanner;

public class Main {

            public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);

                // Crear un cliente
                Cliente cliente = new Cliente("Juan Perez", "123 Calle Principal");

                // Crear una cuenta corriente y una cuenta de ahorro
                CuentaBancarias cuentaCorriente = new CuentaCorriente(cliente, 1000);
                CuentaBancarias cuentaAhorro = new CuentaAhorro(cliente, 5000, 2.5); // Tasa de interés del 2.5%

                int opcion;
                do {
                    System.out.println("\nMenú:");
                    System.out.println("1. Depósito en Cuenta Corriente");
                    System.out.println("2. Retiro de Cuenta Corriente");
                    System.out.println("3. Depósito en Cuenta de Ahorro");
                    System.out.println("4. Retiro de Cuenta de Ahorro");
                    System.out.println("5. Calcular Intereses de Cuenta de Ahorro");
                    System.out.println("6. Consultar Saldo");
                    System.out.println("0. Salir");
                    System.out.print("Seleccione una opción: ");

                    opcion = scanner.nextInt();

                    switch (opcion) {
                        case 1:
                            System.out.print("Ingrese la cantidad a depositar en Cuenta Corriente: ");
                            double depositoCorriente = scanner.nextDouble();
                            cuentaCorriente.depositar(depositoCorriente);
                            break;
                        case 2:
                            System.out.print("Ingrese la cantidad a retirar de Cuenta Corriente: ");
                            double retiroCorriente = scanner.nextDouble();
                            cuentaCorriente.retirar(retiroCorriente);
                            break;
                        case 3:
                            System.out.print("Ingrese la cantidad a depositar en Cuenta de Ahorro: ");
                            double depositoAhorro = scanner.nextDouble();
                            cuentaAhorro.depositar(depositoAhorro);
                            break;
                        case 4:
                            System.out.print("Ingrese la cantidad a retirar de Cuenta de Ahorro: ");
                            double retiroAhorro = scanner.nextDouble();
                            cuentaAhorro.retirar(retiroAhorro);
                            break;
                        case 5:
                            if (cuentaAhorro instanceof CuentaAhorro) {
                                ((CuentaAhorro) cuentaAhorro).calcularIntereses();
                            } else {
                                System.out.println("Esta no es una cuenta de ahorro.");
                            }
                            break;
                        case 6:
                            System.out.println("Saldo en Cuenta Corriente: $" + cuentaCorriente.obtenerSaldo());
                            System.out.println("Saldo en Cuenta de Ahorro: $" + cuentaAhorro.obtenerSaldo());
                            break;
                        case 0:
                            System.out.println("Gracias por usar nuestro sistema.");
                            break;
                        default:
                            System.out.println("Opción no válida. Intente de nuevo.");
                            break;
                    }
                } while (opcion != 0);

                scanner.close();
            }
//Este código crea un sistema de gestión de cuentas bancarias que permite realizar depósitos y retiros en cuentas
// corrientes y de ahorro, así como calcular intereses en cuentas de ahorro.

}