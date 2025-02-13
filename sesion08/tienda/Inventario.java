package tienda;

import tienda.modelos.Papas;
import tienda.modelos.Pastelito;
import tienda.modelos.Producto;
import tienda.modelos.Refresco;

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
                String[] piezas = linea.split(",");

                String nombre = piezas[1];

                switch(piezas[0]) {
                    case "REFRESCO":
                        int mililitros = Integer.parseInt(piezas[2]);
                        int precioRefresco = Integer.parseInt(piezas[3]);

                        inventario.add(new Refresco(nombre, precioRefresco, mililitros));
                    break;

                    case "PAPAS":
                        int peso = Integer.parseInt(piezas[2]);
                        String sabor = piezas[3];
                        int precioPapas = Integer.parseInt(piezas[4]);

                        inventario.add(new Papas(nombre, precioPapas, peso, sabor));
                    break;

                    case "PASTELITO":
                        int precioPastelito = Integer.parseInt(piezas[2]);

                        inventario.add(new Pastelito(nombre, precioPastelito));
                    break;
                }
            }

            bufferedReader.close();
        } catch (IOException ex) {
            System.out.println("NO SE PUDO CARGAR EL INVENTARIO");
        }
    }
}
