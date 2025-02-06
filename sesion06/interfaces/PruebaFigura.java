package interfaces;

public class PruebaFigura {
 
    public static void main(String[] args) {
        // Figura f = new Figura(10);

        Cuadrado c = new Cuadrado(5);

        c.calcularPerimetro(); // 20

        Figura f = new Cuadrado(5); // <-- Valido!
    }
}
