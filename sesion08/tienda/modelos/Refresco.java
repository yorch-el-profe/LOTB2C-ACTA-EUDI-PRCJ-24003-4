package tienda.modelos;

public class Refresco extends Producto {
    
    private int mililitros;

    public Refresco(String nombre, int precio, int mililitros) { 
        super(nombre, precio);
        this.mililitros = mililitros;
    }
    
    public int getMililitros() {
        return mililitros;
    }

    public void setMililitros(int mililitros) {
        this.mililitros = mililitros;
    }

    @Override
    public String convertirLinea() {
        return "REFRESCO," + nombre + "," + mililitros + "," + precio;
    }
}
