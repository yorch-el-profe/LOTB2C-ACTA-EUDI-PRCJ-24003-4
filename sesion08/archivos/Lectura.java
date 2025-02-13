package archivos;

import java.io.File;
import java.io.FileReader;
import java.io.BufferedReader;

public class Lectura {
    
    public static void main(String[] args) {
        
        System.out.println("ABRIENDO ARCHIVO hola_mundo.txt...");

        // Para abrir un archivo se deben seguir los siguientes pasos:

        // 1. Crear una instancia de "File" (la ubicación puede ser relativa/absoluta)
        File archivo = new File("./archivos/hola_mundo.txt");

        // 2. Crear una instancia de FileReader apartir de "File"
        FileReader reader = new FileReader(archivo);

        // 3. Crear una instancia de BufferedReader apartir de "FileReader"
        BufferedReader bufferedReader = new BufferedReader(reader);
    }
}
