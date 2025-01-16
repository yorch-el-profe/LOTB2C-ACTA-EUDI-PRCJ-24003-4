/**
 * Los tipos de datos PRIMITIVOS
 * -> Números Enteros: byte (8), short (16), int (32), long (64)
 * -> Números con Punto: float, double
 * -> Booleanos: boolean
 * -> Character: char
 * 
 * Tipos de datos adicionales (NO PRIMITIVOS)
 * -> Cadenas de texto: String
 * -> Información del sistema: System
 * -> Fechas: Date
 */

public class TipoDatos {

    public static void main(String[] args) {
        // [tipo] [nombre de la variable] = [valor];
        byte numerito = 100;
        long numeritoLargo = 100l; //La letra l inidica que es un long

        float centavos = 0.25f; // La letra f indica que es un float

        double otraCosa = 1.75d; // La letra d inidica que es un double

        int v1 = 1;
        long v2 = 200;

        // En la suma de dos números de diferente tipo, el resultado
        // es el tipo de dato más grande (por ejemplo: int + long = long)
        long resultado = v1 + v2;


        boolean verdadero = true;

        // Una sola letra es con ''
        char letra = 'A';

        // Un texto es con ""
        String nombre = "Paquito Perez";
        String letra2 = "A";
    }
}
