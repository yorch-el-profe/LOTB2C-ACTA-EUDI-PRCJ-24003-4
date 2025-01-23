/**
 * ENCAPSULACIÓN
 * 
 * Controlar el acceso a los atributos y/o métodos.
 * 
 * En Java existen 3 niveles de acceso:
 *  -> public: Cualquiera puede accederlo.
 *  -> private: Se puede acceder de manera INTERNA.
 *  -> protected: Se puede acceder de manera INTERNA o sus DESCENDIENTES.
 */

public class TarjetaDebito {
    
    private double saldo;
    private String numero;
    private String titular;

    public TarjetaDebito(double saldo, String numero, String titular) {
        this.saldo = saldo;
        this.numero = numero;
        this.titular = titular;
    }

    public void abonar(double cantidad) {
        // saldo = saldo + cantidad;
        saldo += cantidad;
    }

    public void gastar(double cantidad) {
        if (saldo >= cantidad) {
            saldo -= cantidad;
        } else {
            System.out.println("Saldo insuficiente...");
        }
    }

    public void imprimirSaldo() {
        System.out.println("Tu saldo disponible es de: $" + saldo);
    }
}
