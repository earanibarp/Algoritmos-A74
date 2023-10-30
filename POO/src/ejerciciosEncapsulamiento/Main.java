/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciosEncapsulamiento;

import java.util.Scanner;

/**
 *
 * Crear una clase Cuadrilatero con los atributos: lado1, lado2; y los métodos
 * para calcular el área y el perímetro. Si es un cuadrado, sólo se
 * proporcionará la longitud de uno de sus lados al constructor. El programa
 * debe permitir ingresar varios cuadriláteros y mostrar el de mayor perímetro
 */
public class Main {
    
    public static float mayorPerimetro(Cuadrilatero cuadrilateros[]){
        float perimetro = 0;
        for(int i = 0; i < cuadrilateros.length; i++){
            if(cuadrilateros[i].calcularPerimetro()>perimetro){
                perimetro = cuadrilateros[i].calcularPerimetro();
            }
        }
        return perimetro;
    }

    public static void main(String[] args) {
        Scanner entradaT = new Scanner(System.in);
        float lado1, lado2;
        int nCuadrilateros;
        
        System.out.print("\nIngresa la cantidad de cuadrilateros a ingresar: ");
        nCuadrilateros = entradaT.nextInt();
        
        Cuadrilatero cuadrilateros[] = new Cuadrilatero[nCuadrilateros];
        
        for (int i = 0; i < cuadrilateros.length; i++){
            System.out.println("\nIngresa los valores del cuadrilatero " + (i+1) + ": ");
            System.out.print("Ingresa la lado 1: ");
            lado1 = entradaT.nextFloat();
            System.out.print("Ingresa la lado 2: ");
            lado2 = entradaT.nextFloat();
            
            if (lado1 == lado2){
                cuadrilateros[i] = new Cuadrilatero(lado1);
            }
            else{
                cuadrilateros[i] = new Cuadrilatero(lado1, lado2);
            }
            
            System.out.println("\nEl área del cuadrilatero es: " + cuadrilateros[i].calcularArea());
            System.out.println("\nEl perimetro del cuadrilatero es: " + cuadrilateros[i].calcularPerimetro());

        }
        System.out.println("\nEl cuadrilatero de mayor perimetro es: " + mayorPerimetro(cuadrilateros));
        
        
        
    }
}
