public class EstructuraRepeticion {
    
    public static void main(String[] args) {

        /*
         * Las 3 sentencias son totalmente OPCIONALES
         * for (inicializacion; condicion; incremento/decremento) {
         * }
         */

        // Ciclo infinito con for
        /*for (;;) {
            System.out.println("Ciclo infinito");
        }*/

        for (int i = 1; i <= 100; i++) {
            if (i%10 == 0) {
                break; // break detiene la ejecución del ciclo
            }

            if (i%2 == 0) {
                continue; // continue genera otra ejecución del ciclo
            }

            System.out.println(i);
        }

        // For Each: Itero sobre una estructura (arreglos, listas, mapas, conjuntos, ...)
        for (String argumento : args) {
            System.out.println("Argumento: " + argumento);
        }
    }
}
