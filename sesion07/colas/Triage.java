package colas;

import java.util.Queue;
import java.util.PriorityQueue;

public class Triage {
    
    private Queue<Paciente> fila;

    public Triage() {
        fila = new PriorityQueue<>();
    }

    public void ingresar(Paciente p) {
        fila.add(p);
    }

    public Paciente siguiente() {
        return fila.poll(); // Me garantiza que este es el paciente con mayor prioridad
    }
}
