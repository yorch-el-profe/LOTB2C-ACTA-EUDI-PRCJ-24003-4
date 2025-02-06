public class Polimorfismo {
    
    // Herencia (Especialización): A -> B -> C -> D -> ...
    // Polimorfismo (Generalización): D es C, C es B, D es B, D es A, B es A

    public static void main(String[] args) {
        /**
         *  El Mago es un Personaje
         *  El Arquiero es un Personaje
         *  El Guerrero es un Personaje
         * 
         *  Otro ejemplo:
         * 
         *  Animal -> Canino -> Perro
         *                   -> Lobo
         * 
         *  Perro es un Canino
         *  Lobo es un Canino
         *  Perro es un Animal
         *  Canino es un Animal
         *  Lobo es un Animal 
         **/

        Mago m1 = new Mago(0, 0, 0);
        m1.recuperar(); // recuperar() es exclusivo de clase Mago

        // Polimorfismo: El Mago es un Personaje
        Personaje m2 = new Mago(0, 0 ,0);
        // m2.recuperar(); <-- No se puede

        // Esto no es polimorfismo por que ambas clases son de la misma generación
        // Guerrero g = new Mago(0, 0, 0);

        // El Mago se comporta como un Object
        Object o = new Mago(10, 10, 10);

        // o.atacar(); <-- No se puede
        System.out.println(o.toString());
    }
}
