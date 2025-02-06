public class Personaje {

    protected int puntosVida;
    protected int puntosAtaque;
    protected int puntosDefensa;

    public Personaje(int puntosVida, int puntosAtaque, int puntosDefensa) {
        this.puntosVida = puntosVida;
        this.puntosAtaque = puntosAtaque;
        this.puntosDefensa = puntosDefensa;
    }

    public void setPuntosVida(int puntosVida) {
        this.puntosVida = puntosVida;
    }

    public void setPuntosAtaque(int puntosAtaque) {
        this.puntosAtaque = puntosAtaque;
    }

    public void setPuntosDefensa(int puntosDefensa) {
        this.puntosDefensa = puntosDefensa;
    }

    public int getPuntosVida() {
        return puntosVida;
    }

    public int getPuntosAtaque() {
        return puntosAtaque;
    }
    
    public int getPuntosDefensa() {
        return puntosDefensa;
    }

    @Override
    public String toString() {
        return "HP: " + puntosVida + " - ATK: " + puntosAtaque + " - DEF: " + puntosDefensa;
    }
}
