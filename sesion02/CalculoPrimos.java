public class CalculoPrimos {
    /*
     * Dado un número n, verificar si el número es un número primo
     * 
     * Un número es primo es aquel que se divide por si mismo y por la unidad (1).
     * 
     * 2, 3, 5, 7, 11, 13, 17, etc...
     */
    
    public static void main(String[] args) {
        int n = 25;
        boolean esPrimo = true;

        for (int i = 2; i < n; i++) {
            System.out.println(i);
            
            if (n%i == 0) {
                 esPrimo = false;
                 break;
            }
        }

        if (esPrimo) {
            System.out.println(n + " es primo.");
        } else {
            System.out.println(n + " no es primo.");
        }
    }
}
