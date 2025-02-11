package conjunto;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Libreria {
    
    private Set<Libro> libros;

    public Libreria() {
        libros = new HashSet<>();
    }

    public void ingresar(Libro libro) {
        libros.add(libro);
    }

    public Set<Libro> getLibros() {
        return libros;
    }
}
