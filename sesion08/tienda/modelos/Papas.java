package tienda.modelos;

public class Papas extends Producto {
    
    private int peso;
    private String sabor;

    public Papas(String nombre, int precio, int peso, String sabor) {
        super(nombre, precio);
        this.peso = peso;
        this.sabor = sabor;
    }
    
    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public String getSabor() {
        return sabor;
    }

    public void setSabor(String sabor) {
        this.sabor = sabor;
    }
}
