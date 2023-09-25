/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bucles;

/**
 *
 * @author Arequipa-docente
 */
public class Ejercicio3 {

    /**
     * Imprimir los 5 primeros números naturales factoriales.
     */
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++){
            int fact = 1;
            for (int j = 1; j <= i; j ++){
                fact = fact * j;
            }
            System.out.println("El factorial de " + i + " es: " + fact);
        }
    }
    
}
