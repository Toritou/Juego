public class Arma {
    //Atributos
    private String nombre;
    private int poderDeAtaque;
    private String tipoDeDanio;

    //Constructor
    public Arma(String nombre, int poderDeAtaque, String tipoDeDanio) {
        this.nombre = nombre;
        this.poderDeAtaque = poderDeAtaque;
        this.tipoDeDanio = tipoDeDanio;
    }

    //Metodos
    public int getPoderAtaque() {
        return poderDeAtaque;
    }
}
