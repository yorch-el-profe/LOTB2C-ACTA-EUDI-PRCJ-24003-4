package listas;

import java.util.List;
import java.util.LinkedList;

/**
 * Todas las colecciones vienen del paquete java.util
 * 
 * Una lista (java.util.List) es una secuencia de "nodos" que almacenan un valor de un tipo en específico.
 * Al final de la lista se apunta a "null".
 * 
 * A diferencia de los arreglos, las listas son de tamaño indefinido.
 * 
 * O -> O -> O -> O -> O -> O -> null
 * 
 * Clases disponibles:
 *  - ArrayList
 *  - LinkedList
 */

public class PruebaLista {

    public static void main(String[] args) {
        List<Integer> lista = new LinkedList<>();

        // Una lista puede almancenar cualquier cantidad de elementos
        for (int i = 0; i < 100; i++) {
            lista.add(i * 1000);
        }

        // Puedo conocer el tamaño de la lista
        System.out.println("El tamaño de la lista es: " + lista.size());

        // Puedo eliminar elementos por posición (0-indexed)
        lista.remove(50); // <--

        lista.add(50000); // Inserta al final

        // Para recorrer una lista se puede utilizar el índice o un foreach
        for (int index = 0; index < lista.size(); index++) {
            System.out.println("#" + index + " = " + lista.get(index));
        }

        for (int numero : lista) {
            System.out.println(numero);
        }
    }
}