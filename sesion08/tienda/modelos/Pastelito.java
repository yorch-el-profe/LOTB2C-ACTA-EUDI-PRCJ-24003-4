package tienda.modelos;

public class Pastelito extends Producto {
    
    public Pastelito(String nombre, int precio) {
        super(nombre, precio);
    }

    @Override
    public String convertirLinea() {
        return "PASTELITO," + nombre + "," + precio;
    }
}
