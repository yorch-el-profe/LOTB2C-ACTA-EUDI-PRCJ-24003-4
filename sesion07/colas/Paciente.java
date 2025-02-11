package colas;

public class Paciente {
    
    private String nombre;
    private int prioridad;

    public Paciente(String nombre, int prioridad) {
        this.nombre = nombre;
        this.prioridad = prioridad;
    }
    
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public int getPrioridad() {
        return prioridad;
    }
    public void setPrioridad(int prioridad) {
        this.prioridad = prioridad;
    }
}
