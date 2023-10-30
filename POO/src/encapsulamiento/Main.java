
package encapsulamiento;


public class Main {
    public static void main (String [] args){
        Persona persona1 = new Persona("Juan", 20);
        
        persona1.setEdad(25);
        System.out.println("El nombre es " + persona1.getNombre() + " y su edad es " + persona1.getEdad());
    }
}
