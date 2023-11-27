package claseAbstracta;


public class Main {
    public static void main (String [] args){
        Cuadrado cuadrado = new Cuadrado(5, "Azul");
        
        Triangulo triangulo = new Triangulo(5, 3, "Amarillo");
        
        System.out.println("El área del cuadrado es: " + cuadrado.calcularArea());
        System.out.println("El área del triángulo es: " + triangulo.calcularArea());
    }
}
