public class MaquinaExpendedora {
    
    // Agregación: Utilizar clases dentro de otras clases
    private Producto producto;

    public MaquinaExpendedora() {
    }

    public MaquinaExpendedora(Producto producto) {
        this.producto = producto;
    }

    public Producto comprar(double dinero) {
        if (dinero >= producto.getPrecio()) {
            return producto;
        } else {
            System.out.println("Faltan: $" + (producto.getPrecio() - dinero));
            return null;
        }
    }
}
