package ejerciciosEncapsulamiento;

/**
 *
 * Crear una clase Cuadrilatero con los atributos: lado1, lado2; 
 * y los métodos para calcular el área y el perímetro. 
 * Si es un cuadrado, sólo se proporcionará la longitud de uno de sus lados al constructor. 
 * El programa debe permitir ingresar varios cuadriláteros y mostrar el de mayor perímetro
 */
public class Cuadrilatero {
    // Atributos
    private float lado1;
    private float lado2;
    
    // Métodos

    public Cuadrilatero(float lado1) {
        this.lado1 = this.lado2 = lado1;
    }

    public Cuadrilatero(float lado1, float lado2) {
        this.lado1 = lado1;
        this.lado2 = lado2;
    }
    
    public float calcularArea(){
        float area = lado1 * lado2;
        return area;
    }
    
    public float calcularPerimetro(){
        float perimetro = (lado1 + lado2) *2;
        return perimetro;
    }
    
}
