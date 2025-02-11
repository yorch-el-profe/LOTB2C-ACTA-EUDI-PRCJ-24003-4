package colas;

public class Paciente implements Comparable<Paciente> {
    
    private String nombre;
    private String causa;
    private int prioridad;

    public Paciente(String nombre, String causa, int prioridad) {
        this.nombre = nombre;
        this.causa = causa;
        this.prioridad = prioridad;
    }

    public String getCausa() {
        return causa;
    }

    public void setCausa(String causa) {
        this.causa = causa;
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

    @Override
    public String toString() {
        return nombre + " - " + causa;
    }

    /**
     * El método debe regresar un número:
     *  - Negativo: Mi objeto va ANTES del que esta como parametro
     *  - Cero: Son iguales
     *  - Positivo: Mi objeto va DESPUES del que esta como parametro
     */
    @Override
    public int compareTo(Paciente p) {
        return prioridad - p.getPrioridad();
    }
}