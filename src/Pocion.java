public class Pocion {
    //Atributos
    private String nombre;
    private int curacion;

    //Constructor
    public Pocion(String nombre, int curacion) {
        this.nombre = nombre;
        this.curacion = curacion;
    }

    //Metodos
    public int getCuracion() {
        return curacion;
    }
}
