public class Persona {

    // Atributos o método estáticos (static)
    // Se usan cuando el objeto no necesita ser creado.
    public static String pais = "México"; 

    // Caracteristicas / Atributos
    // Nombre
    // Apellido
    // Edad
    // ¿Está enfermo?

    // [nivel acceso] [tipo] [nombre] (= [valor] opcional);
    public String nombre;
    public String apellido;
    public int edad;
    public boolean enfermo = true;

    // Acciones / Métodos

    // [nivel acceso] [tipo de retorno] [nombre] ([parametros]) {}

    public String saludar() {
        return "Hola me llamo: " + nombre;
    }

    public String comoEstas(String nombre) {
        return "Hola " + nombre + ", me llamo " + this.nombre + ", ¿cómo estás?";
    }

    // void se usa cuando el método no regresa nada (osea, no hay un "return")
    public void dormir() {
        System.out.println("Zzzzz... " + nombre + " está durmiendo...");
    }

    public static void main(String[] args) {

        // Creación de un objeto (Instancia)
        // [tipo] [nombre] = new [tipo]();
        Persona juanito = new Persona(); // Reservando un espacio en memoria
        Persona lola = new Persona();
        Persona sinNombre = new Persona();

        // Para acceder a los atributos se utiliza la notación "."
        // es decir, objeto.algo
        juanito.nombre = "Juan";
        juanito.apellido = "Perez";
        juanito.edad = 22;
        juanito.enfermo = false;

        System.out.println(juanito.saludar());

        lola.nombre = "Lola";
        lola.apellido = "Garcia";
        lola.edad = 19;
        lola.enfermo = true;

        System.out.println(lola.saludar());

        System.out.println(sinNombre.saludar());

        System.out.println(juanito.comoEstas(lola.nombre));

        System.out.println(juanito);
        System.out.println(lola);

        System.out.println("El país de todas las personas es: " + Persona.pais);

        System.out.println(Math.PI);
        System.out.println(Math.sqrt(4));
    }
}