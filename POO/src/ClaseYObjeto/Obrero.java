package ClaseYObjeto;

import javax.swing.JOptionPane;

public class Obrero {
    // Atributos
    int codigo;
    String nombre;
    int horasT;
    double tarifaXHora;
    
    
    // Métodos
    public Obrero() {
    }

    public Obrero(int codigo, String nombre, int horasT, double tarifaXHora) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.horasT = horasT;
        this.tarifaXHora = tarifaXHora;
    }
    
    public double salarioBruto(){
        double salario_bruto = horasT * tarifaXHora;
        return salario_bruto;
    }
    
    public static void main(String [] args){
        Obrero ob1 = new Obrero();
        ob1.nombre = JOptionPane.showInputDialog("Ingresa el nombre del empleado");
        ob1.horasT = Integer.parseInt(JOptionPane.showInputDialog("Ingresa las horas trabajadas"));
        ob1.tarifaXHora = Double.parseDouble(JOptionPane.showInputDialog("Ingresa la tarifa por hora"));
        
        System.out.println("El salario bruto del trabajador es: " + ob1.salarioBruto());
        
        
    }
}
