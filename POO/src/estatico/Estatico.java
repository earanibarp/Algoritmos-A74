
package estatico;


public class Estatico {
    public static int atributo1;
    
    public static int sumar(int a, int b){
        int suma = a + b;
        return suma;
    }
    public static void main(String[] args){
        
        System.out.println("El valor es: " + Estatico.atributo1);
        System.out.println("La suma es: " + Estatico.sumar(5, 3));

    }
}
