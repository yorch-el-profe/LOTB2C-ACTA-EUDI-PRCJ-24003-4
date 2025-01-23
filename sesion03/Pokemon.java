public class Pokemon {
    
    public String nombre;
    public String tipo;
    public int numero;

    // Un constructor es un método especial
    // el cuál inicializa un objeto

    // Los constructores llevan el mismo nombre de la clase.
    // No tiene valor de retorno

    // Pueden haber 0 o más constructores
    public Pokemon() { // <-- Firma
        this.nombre = "Desconocido";
        this.tipo = "Desconocido";
        this.numero = -1;
    }

    /*public Pokemon(String nombre) {
        this.nombre = nombre;
        this.tipo = "Desconocido";
        this.numero = -1;
    }

    public Pokemon(String nombre, String tipo) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.numero = -1;
    }*/

    public Pokemon(String nombre, String tipo, int numero) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.numero = numero;
    }

    public static Pokemon crearPorNombre(String nombre) {
        Pokemon p = new Pokemon();
        p.nombre = nombre;
        return p;
    }

    public static Pokemon crearPorTipo(String tipo) {
        Pokemon p = new Pokemon();
        p.tipo = tipo;
        return p;
    }

    public String gruñir() { // <-- Firma
        return nombre;
    }

    public static void main(String[] args) {
        
        Pokemon pikachu = new Pokemon("Pikachu", "Eléctrico", 27);
        Pokemon charmander = new Pokemon("Charmander", "Fuego", 4);

        System.out.println(pikachu.nombre);
        System.out.println(charmander.nombre);

        // Creando objetos por medio de un método estático
        Pokemon eevee = Pokemon.crearPorNombre("Eevee");
        Pokemon squirtle = Pokemon.crearPorTipo("Agua");
    }
}
