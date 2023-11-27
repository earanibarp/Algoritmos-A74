package claseAbstracta;


public class Triangulo extends Figura{
    // Atributos
    private double base;
    private double altura;
    
    // Metodos

    public Triangulo(double base, double altura, String color) {
        super(color);
        this.base = base;
        this.altura = altura;
    }
    
    @Override
    public double calcularArea(){
        double area = (base * altura)/2;
        return area;
    }
}
