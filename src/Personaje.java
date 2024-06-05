public abstract class Personaje {
    //Atributos
    protected String nombre;
    protected int hp;
    protected int ataque;
    protected int defensa;
    protected Arma arma;
    protected Pocion pocion;

       //Constructor
    public Personaje(String nombre, int hp, int ataque, int defensa, Arma arma, Pocion pocion) {
        this.nombre = nombre;
        this.hp = hp;
        this.ataque = ataque;
        this.defensa = defensa;
        this.arma = arma;
        this.pocion = pocion;
    }

    //Metodos

    //Calcula el daño recibido menos el de la defensa, tomando en cuanta que si la vida es menor a 10 y en que caso que tenga la posicion disponible, la usa
    public void recibirDanio(int danio) {
        int danioReal = danio - defensa;
        if (danioReal > 0) {
            hp -= danioReal;
        }
        if (hp < 10 && pocion != null) {
            usarPocion();
        }
    }

    //Restaura la vida del personaje y elimina la pocion del inventario
    private void usarPocion() {
        hp += pocion.getCuracion();
        pocion = null;
    }
    //Verifica si el personaje esta vivo (valga la redundancia)
    public boolean estaVivo() {
        return hp > 0;
    }
    //Visita el santuario y aumenta la defensa
    public void visitarSantuario(Santuario santuario) {
        defensa += santuario.getDefensa();
    }
    //Metodo para heredar el ataque
    public abstract void atacar(Personaje personaje);

    public abstract int calcularDanio(Personaje personaje);
    //Devuelve el nombre del personaje
    public String getNombre() {
        return nombre;
    }
    //Devuelve la vida del personaje
    public int getHp() {
        return hp;
    }
}
