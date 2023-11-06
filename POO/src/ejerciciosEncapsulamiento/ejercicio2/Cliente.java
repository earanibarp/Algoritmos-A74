package ejerciciosEncapsulamiento.ejercicio2;

public class Cliente {
    //Atributos
    private String nombre;
    private String apellido;
    private String dni;
    Cuenta cuentas[];
    
    //Métodos

    public Cliente(String nombre, String apellido, String dni, Cuenta[] cuentas) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.cuentas = cuentas;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getDni() {
        return dni;
    }

    public Cuenta[] getCuentas() {
        return cuentas;
    }
    
    public float consultarSaldo(int n){
        return cuentas[n].getSaldo();
    }
    
    public void retirarDinero(int n, float cantidad){
        cuentas[n].retirarDinero(cantidad);
    }
    
    public void depositarDinero(int n, float cantidad){
        cuentas[n].depositarDinero(cantidad);
    }
}
