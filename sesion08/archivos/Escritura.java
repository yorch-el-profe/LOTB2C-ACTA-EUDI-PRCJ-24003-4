package archivos;

import java.io.FileWriter;
import java.io.IOException;
import java.io.BufferedWriter;

public class Escritura {
    
    public static void main(String[] args) {
        try {
            // Para escribir en un archivo, seguir los siguientes pasos:

            // 1. Crear una instancia de FileWriter
            FileWriter writer = new FileWriter("./archivos/adios_mundo.txt", true);

            // 2. Crear una instancia de BufferedWriter
            BufferedWriter bufferedWriter = new BufferedWriter(writer);

            /**
             * Consideraciones:
             * 1. Por default, "FileWriter" sobreescribe el archivo
             *  Para evitarlo, pasarle "true" como segundo parámetro a "FileWriter"
             * 2. El método write no contiene saltos de línea
             */
            bufferedWriter.write("Adios mundo");
            bufferedWriter.newLine();
            bufferedWriter.write("Me despido!\n");
            bufferedWriter.write("Esta es la última");

            bufferedWriter.close();
        } catch (IOException ioex) {
            System.out.println("OCURRIO UN ERROR INESPERADO");
        }
    }
}
