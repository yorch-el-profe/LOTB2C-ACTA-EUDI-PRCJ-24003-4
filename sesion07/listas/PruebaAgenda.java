package listas;

import java.util.Scanner;

public class PruebaAgenda {
    
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Agenda agenda = new Agenda();

        boolean continuar = true;

        do {
            System.out.println("\nElige una opción");
            System.out.println("1. Agregar un contacto");
            System.out.println("2. Buscar un contacto por nombre");
            System.out.println("3. Buscar un contacto por telefono");
            System.out.println("4. Salir");

            int opcion = sc.nextInt();
            sc.nextLine();

            switch(opcion) {
                case 1:
                    System.out.println("\nIngresa el nombre del contacto");
                    String nombre = sc.nextLine();

                    System.out.println("Ingresa el número del contacto");
                    String telefono = sc.nextLine();

                    agenda.agregar(new Contacto(nombre, telefono));

                    System.out.println("\nCONTACTO GUARDADO !!");
                    break;

                case 2:
                    System.out.println("\nIngresa el nombre del contacto a buscar");
                    String nombreABuscar = sc.nextLine();

                    Contacto porNombre = agenda.buscarPorNombre(nombreABuscar);

                    if (porNombre != null) {
                        System.out.println("\n" + porNombre);
                    } else {
                        System.out.println("\nNO SE ENCONTRÓ EL CONTACTO");
                    }
                    break;
                
                case 3:
                    System.out.println("\nIngresa el número del contacto a buscar");
                    String telefonoABuscar = sc.nextLine();

                    Contacto porTelefono = agenda.buscarPorTelefono(telefonoABuscar);

                    if (porTelefono != null) {
                        System.out.println("\n" + porTelefono);
                    } else {
                        System.out.println("\nNO SE ENCONTRÓ EL CONTACTO");
                    }
                    break;

                case 4:
                    continuar = false;
                    break;

                default:
                    System.out.println("\nOPCIÓN INVÁLIDA!!");
            }
        } while (continuar);
    }
}
