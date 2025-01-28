public class Persona {
    
    private String nombre;
    private String apellido;
    private String curp;
    private String rfc;

    // Persona(String, String)
    public Persona(String nombre, String apellido) { 
        this.nombre = nombre;
        this.apellido = apellido;
        this.curp = "CURPXAXX0000";
        this.rfc = "XAXX010101000";
    }

    // Sobrecarga: Crear otro método con el mismo nombre
    // pero diferentes parámetros.

    // Persona(String, String, String)
    public Persona(String nombre, String apellido, String curp) {
        this(nombre, apellido); // Llamando el constructor de arriba
        this.curp = curp; // Sobreescribiendo "curp"
    }

    // Persona(String, String, String, String)
    public Persona(String nombre, String apellido, String curp, String rfc) {
        this(nombre, apellido, curp); // Llamando el constructor de arriba
        this.rfc = rfc; // Sobreescribiendo "rfc"
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getApellido() {
        return apellido;
    }
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    public String getCurp() {
        return curp;
    }
    public void setCurp(String curp) {
        this.curp = curp;
    }
    public String getRfc() {
        return rfc;
    }
    public void setRfc(String rfc) {
        this.rfc = rfc;
    }
}
