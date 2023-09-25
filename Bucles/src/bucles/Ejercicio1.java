/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bucles;

/**
 *
 * @author Arequipa-docente
 */
public class Ejercicio1 {

    /**
     * Imprimir los 10 primeros números naturales al cubo.
     */
    public static void main(String[] args) {
        int i, cubo;
        for (i = 1; i<=10; i++){
            cubo = (int) Math.pow(i, 3);
            System.out.println("El cubo de " +i + " es: "+ cubo);
        }
    }
    
}
