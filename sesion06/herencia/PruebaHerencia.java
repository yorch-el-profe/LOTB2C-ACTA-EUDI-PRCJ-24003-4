package herencia;
public class PruebaHerencia {
    
    public static void main(String[] args) {
        Empleado e1 = new Empleado("Juan Perez", 2000);
        Desarrollador d1 = new Desarrollador("Joaquin Suarez", 5000, "Java");

        System.out.println(e1);
        System.out.println(d1);
    }
}
