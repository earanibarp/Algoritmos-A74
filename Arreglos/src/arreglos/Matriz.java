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
public class Matriz {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner entradaT = new Scanner(System.in);
        
        int cantFilas, cantColumnas;
        
        cantFilas = Integer.parseInt(JOptionPane.showInputDialog("Ingresa "
                + "la cantidad de filas: "));
        cantColumnas = Integer.parseInt(JOptionPane.showInputDialog("Ingresa "
                + "la cantidad de columnas: "));

        int matriz[][] = new int[cantFilas][cantColumnas];

        for (int i = 0; i < matriz.length; i++) { // filas
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print("Ingresa el elemento [" + i + "][" + j + "]: ");
                matriz[i][j] = entradaT.nextInt();
            }
        }

        for (int i = 0; i < matriz.length; i++) { // filas
            for (int j = 0; j < matriz[i].length; j++) { // columnas
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }

    }

}
