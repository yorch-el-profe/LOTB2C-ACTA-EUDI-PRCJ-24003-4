public class MaquinaExpendedoraMenu {
    
    public static void main(String[] args) {
        Producto producto = new Producto("Pepsi Lata 350ml", 20);
        MaquinaExpendedora maquina = new MaquinaExpendedora(producto);

        System.out.println("Bienvenido a la máquina expendora");

        System.out.println("1. Comprar una lata");
        System.out.println("2. Salir");
    }
}
