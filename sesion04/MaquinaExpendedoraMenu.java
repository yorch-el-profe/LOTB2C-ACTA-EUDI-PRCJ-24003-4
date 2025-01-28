
// Importando una biblioteca de Java llamada "Scanner"
// del paquete "java.util"
import java.util.Scanner;

public class MaquinaExpendedoraMenu {

    public static void main(String[] args) {
        // Creando una instancia de la clase Scanner
        Scanner sc = new Scanner(System.in);

        Producto producto = new Producto("Pepsi Lata 350ml", 20);
        MaquinaExpendedora maquina = new MaquinaExpendedora(producto);

        System.out.println("Bienvenido a la máquina expendora");

        boolean continuar = true;

        do {
            System.out.println("\nElige una opción:");
            System.out.println("1. Ver refrescos disponibles");
            System.out.println("2. Comprar una lata");
            System.out.println("3. Salir");

            // Esperamos a que el usuario ingrese algún dato
            // y lo almacenamos en la variable "opcion" como una cadena de texto
            String opcion = sc.nextLine();
        
            switch(opcion) {
                case "1":
                    System.out.println("\n" + producto.imprimirProducto());
                    break;
                case "2":
                    System.out.println("\nIngresa la cantidad de dinero:");
                    
                    double dinero = sc.nextDouble();
                    // Ésta línea es únicamente
                    // Cuando se leen cosas que no son un String (nextLine)
                    sc.nextLine(); 

                    Producto compra = maquina.comprar(dinero);
                    
                    // Caso donde fue una compra exitosa
                    if (compra != null) {
                        System.out.println("\nCompraste: " + compra.imprimirProducto());
                    } else {
                        System.out.println("\nIntenta nuevamente...");
                    }
                break;

                case "3":
                    continuar = false;
                    System.out.println("\nGracias por tu compra!");
                    break;

                default:
                    System.out.println("\nOpción inválida...");
            }
        } while (continuar);
    }
}
