package claseAbstracta;


public class Cuadrado extends Figura {
    // Atributos
    private double lado;
    
    // Metodos

    public Cuadrado(double lado, String color) {
        super(color);
        this.lado = lado;
    }
    
    @Override
    public double calcularArea(){
        double area = lado * lado;
        return area;
    }
}
