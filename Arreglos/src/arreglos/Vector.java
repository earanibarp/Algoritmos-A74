/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arreglos;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Arequipa-docente
 */
public class Vector {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entradaT = new Scanner(System.in);
        int cantVector;
        
        
        cantVector = Integer.parseInt(JOptionPane.showInputDialog("Ingresa la cantidad "
                + "de elementos del Vector: "));
        int vector[] = new int[cantVector];

        for (int i = 0; i < vector.length; i++) {
            System.out.print("Ingresa el elemento [" + (i + 1) + "]: ");
            vector[i] = entradaT.nextInt();
        }
        
        System.out.println("\nLos elementos del vector son: ");

        for (int i = 0; i < vector.length; i++){
            System.out.println(vector[i]);
        }
    }

}
