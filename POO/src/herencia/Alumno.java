package herencia;


public class Alumno extends Persona{
    // Atributos
    private int nota1;
    private int nota2;
    
    // Métodos
    public Alumno(String nombre, int edad, char sexo, int nota1, int nota2){
        super(nombre, edad, sexo);
        this.nota1 = nota1;
        this.nota2 = nota2;
    }

    public int getNota1() {
        return nota1;
    }

    public int getNota2() {
        return nota2;
    }
    
    public double calcularPromedio(){
        double promedio = (nota1+nota2)/2;
        return promedio;
    }
    
    public void mostrarDatos(){
        System.out.println("\nNombre: " + getNombre() + 
                "\nEdad: " + getEdad() + 
                "\nSexo: " + getSexo() + 
                "\nPromedio: " + calcularPromedio());
    }
}
