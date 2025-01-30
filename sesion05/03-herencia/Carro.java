/*
 * Los constructores de las clases hijo
 * SIEMPRE deben de invocar al constructor
 * de la clase padre.
 */

public class Carro extends Vehiculo {
    protected int puertas;

    // this: Hace referencia a la misma clase (Carro)
    // super: Hace referencia a la clase padre (Vehiculo)
    public Carro(String marca, String modelo, int puertas) {
        super(marca, modelo);
        this.puertas = puertas;
    }

    public int getPuertas() {
        return puertas;
    }

    public void setPuertas(int puertas) {
        this.puertas = puertas;
    }

    public void tocarClaxon() {
        System.out.println("🔊🚗");
    }
}
