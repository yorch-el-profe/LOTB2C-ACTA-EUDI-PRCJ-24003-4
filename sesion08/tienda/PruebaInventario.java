package tienda;

import tienda.modelos.Papas;
import tienda.modelos.Refresco;

public class PruebaInventario {
    
    public static void main(String[] args) {
        Inventario inventario = new Inventario();

        // Cargamos el archivo
        inventario.cargar();

        // Agregamos nuevos productos
        inventario.agregar(new Refresco("Lulu Cola", 300, 10));
        inventario.agregar(new Papas("Ruffles", 18, 30, "Queso"));

        // Guardamos en el mismo archivo
        inventario.guardar();
    }
}
