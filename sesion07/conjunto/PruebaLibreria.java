package conjunto;

public class PruebaLibreria {
    

    public static void main(String[] args) {
        
        Libreria libreria = new Libreria();

        libreria.ingresar(new Libro("Harry Potter", "123-123-123"));
        libreria.ingresar(new Libro("Hunger Games", "654-654-654"));
        libreria.ingresar(new Libro("Harry Potter", "123-123-123"));

        System.out.println(libreria.getLibros());
    }
}
