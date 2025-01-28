public class Producto {

    private String nombre;
    private double precio;

    public Producto(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    // Getters: Métodos para "leer" un atributo
    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    // Setters: Métodos para "sobreescribir" un atributo
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    // Sobreescritura
    @Override // <-- Anotaciones
    public String toString() {
        return "[" + nombre + " - $" + precio + "]";
    }

    @Override
    public boolean equals(Object o) {
        Producto p = (Producto) o; // Casting: Convertir de tipo A a tipo B
        return p.getNombre().equals(nombre) && p.getPrecio() == precio;
    }

    public static void main(String[] args) {
        Producto p1 = new Producto("Coca Cola 350ml", 10);
        Producto p2 = new Producto("Coca Cola 350ml", 10);

        System.out.println("p1 == p1?: " + (p1 == p1));
        System.out.println("p1 == p2?: " + (p1 == p2));
        System.out.println("p1.equals(p2)?: " + p1.equals(p2));
    }
}