package herencia.ejercicio;

public class Medico extends Persona {

    // Atributos
    private int nroColegiatura;
    private String especialidad;

    public Medico(int nroColegiatura, String especialidad, String nombre, int edad, char sexo, double peso, double altura) {
        super(nombre, edad, sexo, peso, altura);
        this.nroColegiatura = nroColegiatura;
        this.especialidad = especialidad;
    }

    public int getNroColegiatura() {
        return nroColegiatura;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    /*calcularPrecioConsulta(): determinar, si su especialidad es “otorrino” su 
    precio consulta será 40 soles, si es “traumatología” su precio consulta será 45 soles, 
    si es “dermatología” su precio consulta será 50 soles, otra especialidad será de 65 soles.
     */
    public double calcularPrecioConsulta() {
        double precio = 0;
        switch (especialidad.toLowerCase()) {
            case "otorrino":
                precio = 40;
                break;
            case "traumatologia":
                precio = 45;
                break;
            case "dermatologia":
                precio = 50;
                break;
            default:
                precio = 65;
        }
        return precio;
    }
}
