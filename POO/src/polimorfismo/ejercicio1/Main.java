package polimorfismo.ejercicio1;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    static ArrayList<Poligono> poligonos = new ArrayList<>();
    static Scanner entradaT = new Scanner(System.in);

    public static void main(String[] args) {
        //llenar Poligonos
        llenarPoligonos();

        //mostrar poligonos
        mostrarPoligonos();
    }

    public static void llenarPoligonos() {
        char respuesta;
        int opc;
        do {
            do {
                System.out.println("\t--MENU--");
                System.out.println("1. Ingresar rectangulo");
                System.out.println("2. Ingresar triangulo");
                System.out.print("Opción: ");
                opc = entradaT.nextInt();
            } while (opc < 1 || opc > 2);
            
            switch (opc) {
                case 1: //llenar rectangulo
                    llenarRectangulo();
                    break;
                case 2: //llenar triangulo
                    llenarTriangulo();
                    break;
                default:
                    System.out.println("Opción inválida!");
            }
            System.out.println("¿Desea seguir ingresando más poligonos? (S/N)");
            respuesta = entradaT.next().charAt(0);
        } while (respuesta == 'S' || respuesta == 's');
    }

    public static void llenarRectangulo() {
        double lado1, lado2;

        System.out.print("Ingrese el lado 1: ");
        lado1 = entradaT.nextDouble();
        System.out.print("Ingrese el lado 2: ");
        lado2 = entradaT.nextDouble();

        Rectangulo rectangulo = new Rectangulo(lado1, lado2);

        poligonos.add(rectangulo);
    }

    public static void llenarTriangulo() {
        double base, altura;

        System.out.print("Ingrese la base: ");
        base = entradaT.nextDouble();
        System.out.print("Ingrese la altura: ");
        altura = entradaT.nextDouble();

        Triangulo triangulo = new Triangulo(base, altura);

        poligonos.add(triangulo);
    }

    public static void mostrarPoligonos() {
        for (Poligono poli: poligonos) {
            System.out.println(poli.toString());
            System.out.println("\nArea: " + poli.calcularArea());
            System.out.println("");
        }
    }
}
