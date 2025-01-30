public class ArregloInfinito {
    private int[] arreglo;
    private int tamaño;

    public ArregloInfinito() {
        // Inicializa un arreglo de int de tamaño 10
        arreglo = new int[10];
        tamaño = 0;
    }

    public void agregar(int n) {
        if (tamaño == arreglo.length) {
            int[] nuevoArreglo = new int[arreglo.length + 100];

            for (int i = 0; i < arreglo.length; i++) {
                nuevoArreglo[i] = arreglo[i];
            }
            
            arreglo = nuevoArreglo;
        }

        arreglo[tamaño] = n;
        tamaño++;
    }

    @Override
    public String toString() {
        // Imprimir arreglo
        String result = "[";

        for (int i = 0; i < tamaño; i++) {
            result += arreglo[i];

            if (i < tamaño - 1) {
                result += ", ";
            }
        }

        result += "]";

        return result;
    }

    public static void main(String[] args) {
        ArregloInfinito a = new ArregloInfinito();

        for (int i = 1; i <= 20; i++) {
            a.agregar(i);
        }

        System.out.println(a); // [1, 2, 3, ..., 20]
    }
}