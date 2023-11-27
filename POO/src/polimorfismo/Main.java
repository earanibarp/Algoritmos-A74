package polimorfismo;


public class Main {
    public static void main (String [] args){
        Vehiculo vehiculos[] = new Vehiculo[4];
        vehiculos[0] = new Vehiculo("GH254", "Toyota", "Yaris");
        vehiculos[1] = new VehiculoCarga(500, "GH254", "Toyota", "Yaris");
        vehiculos[2] = new VehiculoCarreras(200, "GH254", "Toyota", "Yaris");
        vehiculos[3] = new VehiculoUrbano(3, "GH254", "Toyota", "Yaris");
        
        for (int i = 0; i <= vehiculos.length; i ++){
            System.out.println(vehiculos[i].toString());
            System.out.println("");
        }        
    }
}
