public class CajeroAutomatico {
    
    private TarjetaDebito tarjeta;

    public void insertarTarjeta(TarjetaDebito tarjeta) {
        this.tarjeta = tarjeta;
    }

    public void abonar(double cantidad) {
        tarjeta.abonar(cantidad);

        System.out.println("Abonaste $" + cantidad);
    }

    public void retirar(double cantidad) {
        tarjeta.gastar(cantidad);

        System.out.println("Retiraste $" + cantidad);
    }

    public static void main(String[] args) {
        CajeroAutomatico atm = new CajeroAutomatico();

        TarjetaDebito tarjeta = new TarjetaDebito(1000, "123123", "Pepito");

        atm.insertarTarjeta(tarjeta);

        atm.retirar(400);
    }
}
