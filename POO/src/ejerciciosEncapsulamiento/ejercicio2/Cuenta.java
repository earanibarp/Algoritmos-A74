package ejerciciosEncapsulamiento.ejercicio2;


public class Cuenta {
    // Atributos
    private int nroCuenta;
    private float saldo;
    
    //Métodos

    public Cuenta(int nroCuenta, float saldo) {
        this.nroCuenta = nroCuenta;
        this.saldo = saldo;
    }

    public int getNroCuenta() {
        return nroCuenta;
    }

    public float getSaldo() {
        return saldo;
    }
    
    public float depositarDinero(float cantidad){
        return saldo += cantidad;
    }
    
    public float retirarDinero(float cantidad){
        return saldo -= cantidad;
    } 
}
