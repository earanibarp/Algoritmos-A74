
package estatico;

public class Main {
    public static void main(String[] args){
        Estatico ob1 = new Estatico();       
        ob1.atributo1 = 8;
        
        
        Estatico ob2 = new Estatico();        
        ob2.atributo1 = 5;
        
        System.out.println("El valor de ob1 es: " + Estatico.atributo1);

    }
}
