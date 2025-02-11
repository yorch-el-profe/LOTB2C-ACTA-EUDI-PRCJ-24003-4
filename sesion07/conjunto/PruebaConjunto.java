package conjunto;

import java.util.Set;
import java.util.HashSet;

/**
 * Un conjunto es una colección de elementos que tienen algo común,
 * que no tienen un orden específico y NO SE PUEDEN REPETIR.
 */

public class PruebaConjunto {
    
    public static void main(String[] args) {
        
        Set<Integer> conjunto = new HashSet<>();

        // Agregando elementos al conjunto
        conjunto.add(100);
        conjunto.add(50);
        conjunto.add(100); // Este elemento no se agrega porque ya existe
        conjunto.add(80);

        // Eliminar elementos de un conjunto;
        conjunto.remove(80);

        // Iterar un conjunto
        for (int numero : conjunto) {
            System.out.println(numero);
        }
    }
}
