
import java.util.Scanner;

// Los valores que no cambian (constantes) se les agrega la palabra "final".
// Y se suele poner el nombre en mayúsculas con "snake_case"

public class Videojuego {

    public static void main(String[] args) {
        final int TOTAL_PERSONAJES = 3; // Constante
        Scanner sc = new Scanner(System.in);
        int pendientes = TOTAL_PERSONAJES;

        // Polimorfismo
        Personaje[] personajes = new Personaje[TOTAL_PERSONAJES];

        for (int i = 1; i <= TOTAL_PERSONAJES; i++) {
            System.out.println("Elige tu tipo de personaje (Quedan " + pendientes + " personajes por elegir): ");
            System.out.println("1. Mago");
            System.out.println("2. Arquero");
            System.out.println("3. Guerrero");

            int opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion)  {
                case 1:
                    personajes[TOTAL_PERSONAJES - pendientes] = new Mago(100, 10, 10);
                break;

                case 2:
                    personajes[TOTAL_PERSONAJES - pendientes] = new Arquero(100, 5, 15);
                break;

                case 3:
                    personajes[TOTAL_PERSONAJES - pendientes] = new Guerrero(100, 25, 10);
                break;
            }
        }
    }
}