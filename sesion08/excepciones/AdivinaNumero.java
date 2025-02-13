package excepciones;

import java.util.Scanner;

public class AdivinaNumero {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int vidas = 5;

        // Math.random() da un número entre 0.0000 y 0.999999
        int adivina = (int)(Math.floor(Math.random() * 10)) + 1;

        do {
            System.out.println("\nAdivina un número del 1 al 10 (tienes " + vidas + " intentos restantes)");
            int numero = sc.nextInt();
            sc.nextLine();

            if (numero == adivina) {
                System.out.println("FELICIDADES GANASTE!!!");
                break;
            } else if (numero < adivina) {
                System.out.println("El número es más grande...");
                vidas--;
            } else  {
                System.out.println("El número es más pequeño...");
                vidas--;
            }

            if (vidas == 0) {
                System.out.println("PERDISTE!! EL NÚMERO ERA: " + adivina);
                break;
            }
        } while (true);
    }
}