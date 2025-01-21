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

        // While: Que lo mismo que el for, solo que únicamente hay una condición
        // para realizar el ciclo

        int j = 11;

        // While: Sólo se ejecuta SI SE CUMPLE LA CONDICIÓN

        while(j <= 10) {
            System.out.println(j + " es menor o igual que 10");
            j++;
        }

        // Do-While: Se ejecuta POR LO MENOS UNA VEZ
        do {
            System.out.println(j + " es menor o igual que 10");
            j++;
        } while(j <= 10);
    }
}
