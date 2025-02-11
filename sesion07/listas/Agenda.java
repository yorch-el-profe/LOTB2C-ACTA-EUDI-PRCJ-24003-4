package listas;

import java.util.List;
import java.util.LinkedList;

public class Agenda {
    
    private List<Contacto> contactos;

    public Agenda() {
        this.contactos = new LinkedList<>();
    }

    // Nota: Es posible que se dupliquen contactos
    public void agregar(Contacto contacto) {
        contactos.add(contacto);
    }

    public Contacto buscarPorNombre(String nombre) {
        for (Contacto contacto : contactos) {
            if (contacto.getNombre().toLowerCase().equals(nombre.toLowerCase())) {
                return contacto;
            }
        }

        return null; // <-- null va significar que no encontro nada
    }

    public Contacto buscarPorTelefono(String telefono) {
        for (Contacto contacto : contactos) {
            if (contacto.getTelefono().equals(telefono)) {
                return contacto;
            }
        }

        return null;
    }
}
