package ejerciciosEncapsulamiento.ejercicio2;

import java.util.Scanner;

/*
Crear un programa para realizar gestiones en un banco, para ello, 
crear dos clases Cliente y Cuenta. Considerar que un cliente se caracteriza por su nombre, 
apellido y DNI. El cliente puede consultar su saldo, así como depositar y retirar dinero de sus cuentas. 
Además, cada cuenta se caracteriza por un número de cuenta y un saldo.
 */
public class Main {

    public static int buscarCuenta(Cuenta cuentas[], int n) {
        int indice = 0, i = 0;
        boolean encontrado = false;
        while ((i < cuentas.length) && (encontrado == false)) {
            if (cuentas[i].getNroCuenta() == n) {
                encontrado = true;
                indice = i;
            }
            i++;
        }

        if (encontrado == false) {
            indice = -1;
        }

        return indice;
    }

    public static void main(String[] args) {
        Scanner entradaT = new Scanner(System.in);
        String nombre, apellido, dni;
        float saldo, cantidad;
        int nroCuenta, nCuentas, opc, indiceCuenta;
        Cliente cliente;

        System.out.print("Ingresa tu nombre: ");
        nombre = entradaT.nextLine();
        System.out.print("Ingresa tu apellido: ");
        apellido = entradaT.nextLine();
        System.out.print("Ingresa tu dni: ");
        dni = entradaT.nextLine();

        System.out.print("Ingresa la cantidad de cuentas: ");
        nCuentas = entradaT.nextInt();

        Cuenta cuentas[] = new Cuenta[nCuentas];

        for (int i = 0; i < cuentas.length; i++) {
            System.out.print("\nIngresa los datos de la cuenta " + (i + 1) + ": ");
            System.out.print("\nIngresa el nro de cuenta: ");
            nroCuenta = entradaT.nextInt();
            System.out.println("Ingresa el saldo: ");
            saldo = entradaT.nextFloat();

            cuentas[i] = new Cuenta(nroCuenta, saldo);
        }

        cliente = new Cliente(nombre, apellido, dni, cuentas);

        do {
            System.out.print("\t **MENU**");
            System.out.println("\n1. Depositar dinero de la cuenta");
            System.out.println("2. Retirar dinero de la cuenta");
            System.out.println("3. Consultar saldo");
            System.out.println("4. Salir");
            System.out.print("Ingre la opción a elegir: ");
            opc = entradaT.nextInt();

            switch (opc) {
                case 1:
                    for(int i = 0; i < cuentas.length; i++){
                        System.out.println("Nro de Cuenta " + (i+1) + ": " +cuentas[i].getNroCuenta());                        
                    }
                    System.out.print("Ingrese el numero de cuenta: ");
                    nroCuenta = entradaT.nextInt();
                    indiceCuenta = buscarCuenta(cuentas, nroCuenta);

                    if (indiceCuenta == -1) {
                        System.out.print("El nro de cuenta no existe!");
                    } else {
                        System.out.print("Ingresa la cantidad a depositar");
                        cantidad = entradaT.nextFloat();
                        
                        cliente.depositarDinero(indiceCuenta, cantidad);
                        System.out.print("Depósito realizado con éxito");
                        System.out.println("Saldo actual: " + cliente.consultarSaldo(indiceCuenta));
                    }
                    break;
                case 2: 
                    for(int i = 0; i < cuentas.length; i++){
                        System.out.println("Nro de Cuenta " + (i+1) + ": " +cuentas[i].getNroCuenta());                        
                    }
                    System.out.print("Ingrese el numero de cuenta: ");
                    nroCuenta = entradaT.nextInt();
                    indiceCuenta = buscarCuenta(cuentas, nroCuenta);

                    if (indiceCuenta == -1) {
                        System.out.print("El nro de cuenta no existe!");
                    } else {
                        System.out.print("Ingresa la cantidad a retirar");
                        cantidad = entradaT.nextFloat();
                        
                        cliente.retirarDinero(indiceCuenta, cantidad);
                        System.out.print("Retiro realizado con éxito");
                        System.out.println("Saldo actual: " + cliente.consultarSaldo(indiceCuenta));
                    }
                    break;
                case 3:
                    for(int i = 0; i < cuentas.length; i++){
                        System.out.println("Nro de Cuenta " + (i+1) + ": " +cuentas[i].getNroCuenta());                        
                    }
                    System.out.print("Ingrese el numero de cuenta: ");
                    nroCuenta = entradaT.nextInt();
                    indiceCuenta = buscarCuenta(cuentas, nroCuenta);

                    if (indiceCuenta == -1) {
                        System.out.print("El nro de cuenta no existe!");
                    } else {
                        System.out.println("Saldo actual: " + cliente.consultarSaldo(indiceCuenta));
                    }
                    break;
                case 4: break;
                default: 
                    System.out.println("Error, la opción no existe!");
            }
        } while (opc != 4);
    }
}
