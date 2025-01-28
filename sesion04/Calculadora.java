public class Calculadora {
    
    public int suma(int a, int b) {
        return a + b;
    }

    public int suma(int a, int b, int c) {
        return suma(a, b) + c;
    }

    public double suma(int a, double b) {
        return a + b;
    }

    public float suma(float a, float b) {
        return a + b;
    }

    public long suma(long a, long b) {
        return a + b;
    }

    public double suma(double a, double b) {
        return a + b;
    }

    public static void main(String[] args) {

        Calculadora c = new Calculadora();

        c.suma(10.5d, 9.8d);
    }
}
