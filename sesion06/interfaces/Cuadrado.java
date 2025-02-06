package interfaces;

// extends -> Herencia
// implements -> Implementar una interfaz

public class Cuadrado implements Figura {
    
    private double lado;

    public Cuadrado(double lado) {
        this.lado = lado;
    }

    @Override
    public double calcularPerimetro() {
        return lado * 4;
    }

    @Override
    public double calcularArea() {
        return lado * lado;
    }
}
