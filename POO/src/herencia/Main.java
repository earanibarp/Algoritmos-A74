package herencia;

import java.util.Scanner;


public class Main {
    public static void main(String [] args){
        Alumno alumno = new Alumno("Juan Perez", 25, 'M', 15, 10);
        
        alumno.mostrarDatos();
        
        Alumno alumno2 = new Alumno("Juanito Ordoñez", 21, 'M', 12, 12);
        
        alumno2.mostrarDatos();
    }
}
