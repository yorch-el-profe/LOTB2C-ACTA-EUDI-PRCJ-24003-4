public class Guerrero extends Personaje {

    public Guerrero(int puntosVida, int puntosAtaque, int puntosDefensa) {
        super(puntosVida, puntosAtaque, puntosDefensa);
    }
    
    @Override
    public void atacar() {
        int ataqueFinal = (int)(super.getPuntosAtaque() * 1.5);
        System.out.println("<< Atacando con " + ataqueFinal + " puntos >>");
    }

    @Override
    public String toString() {
        return "Guerrero [ " + super.toString() + " ]";
    }
}
