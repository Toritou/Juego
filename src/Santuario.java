public class Santuario {
    //Atributos
    private String nombre;
    private int defensaExtra;

    //Constructor
    public Santuario(String nombre, int defensaExtra) {
        this.nombre = nombre;
        this.defensaExtra = defensaExtra;
    }

    //Metodos
    public int getDefensa() {
        return defensaExtra;
    }
}
