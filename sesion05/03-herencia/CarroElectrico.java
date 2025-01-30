public class CarroElectrico extends Carro {
    private int capacidadCarga;

    public CarroElectrico(String marca, String modelo, int puertas, int capacidadCarga) {
        super(marca, modelo, puertas);
        this.capacidadCarga = capacidadCarga;
    }

    public int getCapacidadCarga() {
        return capacidadCarga;
    }

    public void setCapacidadCarga(int capacidadCarga) {
        this.capacidadCarga = capacidadCarga;
    }

    public void estadoCarga() {
        System.out.println("🔋🚗");
    }
}
