public class Guerrero extends Personaje {
    private int fuerza;

    public Guerrero(String nombre, int hp, int ataque, int defensa, Arma arma, Pocion pocion, int fuerza) {
        super(nombre, hp, ataque, defensa, arma, pocion);
        this.fuerza = fuerza;
    }

    @Override
    public void atacar(Personaje personaje) {
        int danio = calcularDanio(personaje);
        personaje.recibirDanio(danio);
    }

    @Override
    public int calcularDanio(Personaje personaje) {
        return ataque + fuerza + arma.getPoderAtaque();
    }
}
