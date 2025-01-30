/**
 * Un arreglo es un espacio múltiple y CONTINUO de memoria
 * donde puedo almacenar valores del mismo tipo.
 * 
 * REGLA: Los arreglos son de tamaño FIJO. Osea,
 * desde la creación debo especificar el tamaño.
 * 
 */

public class Arreglo {

    public static void main(String[] args) {
        // Creando un arreglo de tamaño 5 de tipo "int"
        int[] numeritos = new int[5];

        // Acceder a la información es con la posición
        // Los arreglo son "0-index"
        numeritos[0] = 98743; // Primera posición (0)
        numeritos[4] = 23433; // Última posición (4)

        // Las posiciones vacías tienen los valores por default
        Object[] objetos = new Object[3];

        System.out.println(numeritos[2]); // 0
        System.out.println(objetos[1]); // null

        // Si se accede a una posición inexistente, se arroja una Excepción
        // numeritos[10000000] = 0; // ArrayIndexOutOfBoundsException

        // Para leer el tamaño de un arreglo se usa la propiedad "length"
        System.out.println(numeritos.length); // 5

        // Para recorrer un arreglo hay 2 formas
        for (int index = 0; index < numeritos.length; index++) {
            System.out.println("numeritos[" + index + "] = " + numeritos[index]);
        }

        for (int numero : numeritos) {
            System.out.println(numero);
        }
    }
}