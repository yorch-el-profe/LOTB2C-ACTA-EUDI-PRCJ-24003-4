package conjunto;

public class Libro {
    
    private String titulo;
    private String isbn;

    public Libro(String titulo, String isbn) {
        this.titulo = titulo;
        this.isbn = isbn;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    @Override
    public boolean equals(Object o) {
        Libro l = (Libro) o; // Casting
        return isbn.toLowerCase().equals(l.getIsbn().toLowerCase());
    }

    @Override
    public String toString() {
        return titulo;
    }

    @Override
    public int hashCode() {
        return isbn.hashCode();
    }
}
