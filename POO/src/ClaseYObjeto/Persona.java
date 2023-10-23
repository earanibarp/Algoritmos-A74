
package ClaseYObjeto;

import javax.swing.JOptionPane;


public class Persona {
    // Atributos
    String nombre;
    int edad;
    
    
    // Métodos
    
    //Método constructor
    public Persona(){
        
    }

    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }
    

    
    public void pedirDatos(){
        nombre = JOptionPane.showInputDialog("Ingresa el nombre");
        edad = Integer.parseInt(JOptionPane.showInputDialog("Ingresa la edad"));
    }
    
    public void mostrarDatos(){
        System.out.println("El nombre es " + nombre + " y la edad es " + edad);
    }
    
    public static void main (String [] args){
        Persona p1 = new Persona();
        
        p1.pedirDatos();
        p1.mostrarDatos();
        
        Persona p2 = new Persona();
        
        p2.pedirDatos();
        p2.mostrarDatos();
        
        Persona p3 = new Persona("Fiorella", 20);
        
        p3.mostrarDatos();
        
        
    }
}












