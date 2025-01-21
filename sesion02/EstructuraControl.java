public class EstructuraControl {

    public static void main(String... args) {

        int edad = 17;

        if (edad >= 60) {
            System.out.println("Es de la tercera edad");
        } else if (edad >= 18) { 
            System.out.println("Es mayor de edad");
        } else {
            System.out.println("Es menor de edad");
        }

        // If de una línea: 
        // (condición booleana) ? (caso de ser verdadero) : (caso de ser falso);

        boolean puedeManejar = edad >= 16 ? true : false;

        String generacion = edad <= 14 ? "Generación Alfa" : 
            (edad <= 28 ? "Generación Z" : 
                (edad <= 56 ? "Generación Millenial" : "Generación X"));

        System.out.println(generacion);

        /*
            String generacion;

            if (edad <= 14) {
                generacion = "Generacion Alfa";
            } else if (edad <= 28) {
                generacion = "Generacion Z";
            } else {
                generacion = "Generacion Millenial";
            }
         */

        // Switch se utiliza para casos muy especificos.        
         switch (edad) {
            case 11:
            case 12:
            case 13:
            case 14:
                System.out.println("Generación Alfa");
                break;
            case 27:
            case 28:
                System.out.println("Generación Z");
                break;
            default:
                System.out.println("No se que generación eres");
         }


        String tarjeta = "AMEX";

        int descuento;

        switch (tarjeta) {
            case "VISA":
                descuento = 10;
                break;
            case "MASTERCARD":
                descuento = 12;
                break;
            case "AMEX":
                descuento = 5;
                break;
            default:
                descuento = 0;
        }
    }
}