package claseAbstracta;


public abstract class Figura {
    // Atributos
    private String color;
    
    // Metodos

    public Figura(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }
    
    public abstract double calcularArea();
}
