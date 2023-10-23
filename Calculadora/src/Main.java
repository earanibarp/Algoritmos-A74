
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author Arequipa-docente
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entradaT = new Scanner(System.in);

    float num1, num2;

    Aritmetica aritmetica = new Aritmetica();

    System.out.println("Ingresa el primer número");
    num1  = entradaT.nextFloat();

    System.out.println("Ingresa el segundo número");
    num2  = entradaT.nextFloat();

    System.out.println ("La suma es: " + aritmetica.suma(num1, num2));
    System.out.println ("La resta es: " + aritmetica.resta(num1, num2));
    System.out.println ("La multiplicación es: " + aritmetica.multiplicacion(num1, num2));
    System.out.println ("La división es: " + aritmetica.division(num1, num2));
    }
    
}
