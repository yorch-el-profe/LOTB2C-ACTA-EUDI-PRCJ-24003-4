package herencia;
public class Desarrollador extends Empleado {
    
    private String lenguajeProgramacion;

    public Desarrollador(String nombre, double salario, String lenguajeProgramacion) {
        super(nombre, salario);
        this.lenguajeProgramacion = lenguajeProgramacion; 
    }

    public String getLenguajeProgramacion() {
        return lenguajeProgramacion;
    }

    public void setLenguajeProgramacion(String lenguajeProgramacion) {
        this.lenguajeProgramacion = lenguajeProgramacion;
    }

    @Override
    public double calcularSalario() {
        return super.calcularSalario() * 1.5;
    }

    @Override
    public String toString() {
        return super.toString() + " - Lenguaje Programación: " + lenguajeProgramacion;
    }
}
