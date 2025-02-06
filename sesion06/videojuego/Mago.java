public class Mago extends Personaje {
    
    public Mago(int puntosVida, int puntosAtaque, int puntosDefensa) {
        super((int)(puntosVida * 1.3), puntosAtaque, puntosDefensa);

        // Otras alternativas:
        // super.setPuntosVida((int)(puntosVida * 1.3));
        // super.puntosVida *= 1.3;
    }

    public void recuperar() {
        super.puntosVida = 100;
    }

    @Override
    public String toString() {
        return "Mago [ " + super.toString() + " ]";
    }
}
