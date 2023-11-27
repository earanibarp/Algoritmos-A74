package ejerciciosEncapsulamiento.ejercicio1;

import java.util.Scanner;

/**
 * Crear un programa que, dada una serie de vehículos caracterizados por su
 * marca, modelo y precio, imprima las propiedades del vehículo más barato. Para
 * ello, las características de cada vehículo deben ser introducidas por
 * teclado, por último, crear una clase que represente a cada uno de ellos.​
 */
public class Main {

    public static int vehiculoMasBarato(Vehiculo vehiculos[]) {
        float precio = vehiculos[0].getPrecio();
        int indice = 0;
        for (int i = 1; i < vehiculos.length; i++) {
            if (vehiculos[i].getPrecio() < precio) {
                precio = vehiculos[i].getPrecio();
                indice = i;
            }
        }
        return indice;
    }

    public static void main(String[] args) {
        Scanner entradaT = new Scanner(System.in);
        String marca, modelo;
        float precio;
        int nVehiculos;

        System.out.print("\nIngresa la cantidad de vehiculos a ingresar: ");
        nVehiculos = entradaT.nextInt();

        Vehiculo vehiculos[] = new Vehiculo[nVehiculos];

        for (int i = 0; i < vehiculos.length; i++) {
            System.out.println("\nIngresa los datos del vehículo" + (i + 1) + ": ");
            entradaT.nextLine();
            System.out.print("Ingresa la marca: ");
            marca = entradaT.nextLine();
            System.out.print("Ingresa la modelo: ");
            modelo = entradaT.nextLine();
            System.out.print("Ingresa el precio: ");
            precio = entradaT.nextFloat();

            vehiculos[i] = new Vehiculo(marca, modelo, precio);

        }
        int indiceVehiculoBarato = vehiculoMasBarato(vehiculos);
        System.out.println("\nEl vehículo más barato es: " + vehiculos[indiceVehiculoBarato].mostrarDatosVehiculo());
    }
}

































