public class Arquero extends Personaje {
    
    public Arquero(int puntosVida, int puntosAtaque, int puntosDefensa) {
        super(puntosVida, puntosAtaque, puntosDefensa);
    }

    @Override
    public void defender() {
        int defensaFinal = (int)(super.getPuntosDefensa() * 1.3);
        System.out.println("<< Defendiendo con " + defensaFinal + " puntos >>");
    }

    @Override
    public String toString() {
        return "Arquero [ " + super.toString() + " ]";
    }
}
