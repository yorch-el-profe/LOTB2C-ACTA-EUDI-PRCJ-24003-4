package interfaces;

/**
 * Las interfaces son como las clases pero
 * no hay ninguna implementación.
 * 
 * También se les llama "contrato", porque una clase
 * que implemente una interfaz, debe implementar todos los métodos.
 * 
 * No se pueden crear instancias de una interfaz.
 */

public interface Figura {

    public double calcularPerimetro();

    public double calcularArea();
}
 