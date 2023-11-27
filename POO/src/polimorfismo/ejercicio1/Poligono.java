/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package polimorfismo.ejercicio1;

/**
 *
 * @author Arequipa-docente
 */
public abstract class Poligono {
    //Atributos
    private int nroLados;
    
    //Metodos
    public Poligono(int nroLados) {
        this.nroLados = nroLados;
    }

    public int getNroLados() {
        return nroLados;
    }
    
    public abstract double calcularArea();

    @Override
    public String toString() {
        return "NroLados=" + nroLados;
    }
    
    
}
