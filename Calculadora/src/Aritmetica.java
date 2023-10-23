/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Arequipa-docente
 */
public class Aritmetica {
    private float ultimoResultado;

    public float suma(float primerSumando, float segundoSumando) {
        return ultimoResultado = primerSumando + segundoSumando;
    }

    public float resta(float minuendo, float sustraendo) {
        return ultimoResultado = minuendo - sustraendo;
    }

    public float multiplicacion(float primerFactor, float segundoFactor) {
        return ultimoResultado = primerFactor * segundoFactor;
    }

    public float division(float dividendo, float divisor) {
        ultimoResultado = dividendo / divisor;
        return ultimoResultado;
    }

    public float getUltimaResultado() {
        return ultimoResultado;
    }
}
