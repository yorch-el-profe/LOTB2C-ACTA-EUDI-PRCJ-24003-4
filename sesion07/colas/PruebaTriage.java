package colas;

public class PruebaTriage {
    
    public static void main(String[] args) {
        final int NIVEL_MUY_URGENTE = 0;
        final int NIVEL_URGENTE = 1;
        final int NIVEL_MEDIO = 5;
        final int NIVEL_SIN_IMPORTANCIA = 10;
        
        Triage triage = new Triage();


        // Ingresando pacientes
        triage.ingresar(new Paciente("Rodrigo", "Tiene dolor de cabeza", NIVEL_SIN_IMPORTANCIA));
        triage.ingresar(new Paciente("Alicia", "Contracciones de embarazo", NIVEL_URGENTE));
        triage.ingresar(new Paciente("Elias", "COVID", NIVEL_MEDIO));
        triage.ingresar(new Paciente("Uriel", "Balazo", NIVEL_MUY_URGENTE));
        triage.ingresar(new Paciente("Melissa", "Fiebre de 40°", NIVEL_URGENTE + 1));

        // Revisando la fila de pacientes
        Paciente p;

        while((p = triage.siguiente()) != null) {
            System.out.println(p);
        }
    }
}
