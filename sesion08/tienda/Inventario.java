package tienda;

import tienda.modelos.Producto;
import java.util.List;
import java.util.LinkedList;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.BufferedReader;

public class Inventario {

    private List<Producto> inventario = new LinkedList<>(); 
    
    public void cargar() {
        try {
            File archivo = new File("./tienda/inventario.txt");
            FileReader reader = new FileReader(archivo);
            BufferedReader bufferedReader = new BufferedReader(reader);

            String linea;

            while ((linea = bufferedReader.readLine()) != null) {
                String[] piezas = linea.split("\\|");

                switch(piezas[0]) {
                    case "REFRESCO":
                        System.out.println("Soy un refresco");
                    break;

                    case "PAPAS":
                        System.out.println("Soy unas papas");
                    break;

                    case "PASTELITO":
                        System.out.println("Soy un pastelito");
                    break;
                }
            }

            bufferedReader.close();
        } catch (IOException ex) {
            System.out.println("NO SE PUDO CARGAR EL INVENTARIO");
        }
    }
}
