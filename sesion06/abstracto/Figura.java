package abstracto;

/**
 * Una clase abstracta es una clase "incompleta".
 * Es decir, tiene métodos que no han sido implementados
 * y se espera que los hijos sean quienes lo implementen.
 * 
 * No se pueden crear instancias de una clase abstracta.
 * 
 * Una clase hija que no implemente todos los métodos abstractos
 * de la clase padre, es una clase abstracta también.
 */

public abstract class Figura {

    protected int numeroLados;

    public Figura(int numeroLados) {
        this.numeroLados = numeroLados;
    }
 
    public abstract double calcularPerimetro();

    public abstract double calcularArea();

    public int getNumeroLados() {
        return numeroLados;
    }

    public void setNumeroLados(int numeroLados) {
        this.numeroLados = numeroLados;
    }
}
 