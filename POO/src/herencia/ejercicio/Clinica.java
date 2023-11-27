package herencia.ejercicio;

import java.util.ArrayList;
import java.util.Scanner;

public class Clinica {

    public static int buscarHistoriaPaciente(ArrayList<Paciente> pacientes, int nroHistoriaPaciente) {
        int indice = 0;
        boolean encontrado = false;

        for (int i = 0; i < pacientes.size(); i++) {
            if (pacientes.get(i).getNroHistoria() == nroHistoriaPaciente) {
                indice = i;
                encontrado = true;
                break;
            }
        }
        if (encontrado == false) {
            indice = -1;
        }
        return indice;
    }

    public static void main(String[] args) {
        Scanner entradaT = new Scanner(System.in);

        String nombrePaciente, fechaPrimeraConsultaPaciente, nombreMedico, especialidadMedico;
        int edadPaciente, nroHistoriaPaciente, edadMedico, nroColegiaturaMedico, opc, indicePaciente, opcMedico;
        char sexoPaciente, sexoMedico;
        double pesoPaciente, alturaPaciente, pesoMedico, alturaMedico;

        ArrayList<Paciente> pacientes = new ArrayList<>();
        ArrayList<Medico> medicos = new ArrayList<>();

        do {
            System.out.println("\n\t***MENU***");
            System.out.println("1. Nuevo Paciente");
            System.out.println("2. Nuevo Medico");
            System.out.println("3. Nueva consulta");
            System.out.println("4. Salir");
            System.out.print("Ingresa la opción a realizar: ");
            opc = entradaT.nextInt();

            switch (opc) {
                case 1:
                    System.out.print("Ingresa el nombre del paciente:");
                    entradaT.nextLine();
                    nombrePaciente = entradaT.nextLine();
                    System.out.print("Ingresa la edad del paciente:");

                    edadPaciente = entradaT.nextInt();
                    System.out.print("Ingresa el sexo del paciente:");
                    sexoPaciente = entradaT.next().charAt(0);
                    System.out.print("Ingresa el peso del paciente:");
                    pesoPaciente = entradaT.nextDouble();
                    System.out.print("Ingresa el altura del paciente:");
                    alturaPaciente = entradaT.nextDouble();
                    System.out.print("Ingresa el numero de historia del paciente:");
                    nroHistoriaPaciente = entradaT.nextInt();
                    System.out.print("Ingresa la fecha consulta del paciente (año-mes-día):");
                    fechaPrimeraConsultaPaciente = entradaT.next();

                    pacientes.add(new Paciente(nroHistoriaPaciente, fechaPrimeraConsultaPaciente, nombrePaciente, edadPaciente, sexoPaciente, pesoPaciente, alturaPaciente));
                    break;
                case 2:
                    System.out.print("Ingresa el nombre del medico:");
                    entradaT.nextLine();
                    nombreMedico = entradaT.nextLine();                    
                    System.out.print("Ingresa la edad del medico:");
                    edadMedico = entradaT.nextInt();
                    System.out.print("Ingresa el sexo del medico: ");
                    sexoMedico = entradaT.next().charAt(0);
                    System.out.print("Ingresa el peso del medico: ");
                    pesoMedico = entradaT.nextDouble();
                    System.out.print("Ingresa el altura del medico: ");
                    alturaMedico = entradaT.nextDouble();
                    System.out.print("Ingresa el numero de colegiatura del medico: ");
                    nroColegiaturaMedico = entradaT.nextInt();
                    System.out.print("Ingresa la especialidad del medico: ");
                    especialidadMedico = entradaT.next();

                    medicos.add(new Medico(nroColegiaturaMedico, especialidadMedico, nombreMedico, edadMedico, sexoMedico, pesoMedico, alturaMedico));
                    break;
                case 3:
                    System.out.print("Ingrese el número de historia de usuario: ");
                    nroHistoriaPaciente = entradaT.nextInt();

                    indicePaciente = buscarHistoriaPaciente(pacientes, nroHistoriaPaciente);

                    if (indicePaciente == -1) {
                        System.out.println("Paciente no encontrado.");
                    } else {
                        System.out.println("\nConsulta para el paciente: " + pacientes.get(indicePaciente).getNombre());
                        System.out.println("Médicos disponibles: ");

                        for (int i = 0; i < medicos.size(); i++) {
                            System.out.println((i + 1) + ". " + medicos.get(i).getNombre() + " - " + medicos.get(i).getEspecialidad());
                        }
                        System.out.print("Ingresa el médico seleccionado: ");
                        opcMedico = entradaT.nextInt();
                        if (opcMedico > 0 && opcMedico <= medicos.size()) {
                            System.out.println("Médico seleccionado: " + medicos.get(opcMedico - 1).getNombre() + ", especialidad: " + medicos.get(opcMedico - 1).getEspecialidad());
                            System.out.println("Precio de la consulta: " + medicos.get(opcMedico - 1).calcularPrecioConsulta());
                        } else {
                            System.out.println("Opción no válida!");
                        }
                    }
                    break;
                case 4:
                    break;
                default:
                    System.out.println("Opción incorrecta, selecciona una opción del menú.");
            }
        } while (opc != 4);

    }
}
