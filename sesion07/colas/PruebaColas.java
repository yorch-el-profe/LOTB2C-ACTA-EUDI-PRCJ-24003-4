package colas;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Listas
 * Colas: El primero que entra es el primero que sale (FIFO)
 * Pilas: El último que entra es el primero que sale (LIFO)
 */

public class PruebaColas {
    
    public static void main(String[] args) {
        Queue<String> cola = new LinkedList<>();

        // Se insertan en el orden
        cola.add("Mario Bros");
        cola.add("Zelda");
        cola.add("Master Chief");
        cola.add("Kratos");
        cola.add("Ryu");

        // Recuperar el elemento de enfrente
        System.out.println(cola.poll()); // Elimina el elemento de enfrente ("Mario")

        // Cuando cola esta vacia, el método "poll()" regresa null

        // Vaciar toda la cola
        String nombre;

        while((nombre = cola.poll()) != null) {
            System.out.println(nombre);
        }
    }
}
