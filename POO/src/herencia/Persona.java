
package herencia;


public class Persona {
    // Atributos
    private String nombre;
    private int edad;
    private char sexo;
    
    // Métodos

    public Persona(String nombre, int edad, char sexo) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public char getSexo() {
        return sexo;
    }
    
}
