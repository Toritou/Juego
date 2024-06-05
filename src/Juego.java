import java.util.Random;
import javax.swing.JTextArea;

public class Juego {
    private final Personaje personaje1;
    private final Personaje personaje2;

    public Juego() {
        // Objetos de combate
        Arma espada = new Arma("Espada", 15, "Fisico");
        Arma baston = new Arma("Baston", 12, "Magico");

        Pocion pocionGuerrero = new Pocion("Pocion de Vida", 20);
        Pocion pocionMago = new Pocion("Pocion de Vida", 20);

        // Personajes
        this.personaje1 = new Guerrero("Guerrero", 100, 20, 10, espada, pocionGuerrero, 5);
        this.personaje2 = new Mago("Mago", 80, 25, 8, baston, pocionMago, 10);
    }

    public void iniciarCombate(JTextArea textArea1) {
        Random random = new Random();
        textArea1.setText("");

        // Posibilidad de encontrar un santuario para personaje1
        if (random.nextBoolean()) {
            personaje1.visitarSantuario(new Santuario("Santuario 1", 10));
            textArea1.append(personaje1.getNombre() + " ha pasado por un santuario, su defensa ha aumentado.\n");
        }

        // Posibilidad de encontrar un santuario para personaje2
        if (random.nextBoolean()) {
            personaje2.visitarSantuario(new Santuario("Santuario 2", 10));
            textArea1.append(personaje2.getNombre() + " ha pasado por un santuario, su defensa ha aumentado.\n");
        }

        while (personaje1.estaVivo() && personaje2.estaVivo()) {
            turnoDeAtaque(personaje1, personaje2, textArea1);
            if (personaje2.estaVivo()) {
                turnoDeAtaque(personaje2, personaje1, textArea1);
            }
        }
        declararGanador(textArea1);
    }

    private void turnoDeAtaque(Personaje atacante, Personaje defensor, JTextArea textArea1) {
        atacante.atacar(defensor);
        textArea1.append(atacante.getNombre() + " ataca a " + defensor.getNombre() + " y le causa daño.\n");
        textArea1.append(defensor.getNombre() + " tiene " + defensor.getHp() + " puntos de vida restantes.\n");
    }

    private void declararGanador(JTextArea textArea1) {
        if (personaje1.estaVivo()) {
            textArea1.append(personaje1.getNombre() + " es el ganador!\n");
        } else {
            textArea1.append(personaje2.getNombre() + " es el ganador!\n");
        }
    }

    public Personaje getPersonaje1() {
        return personaje1;
    }

    public Personaje getPersonaje2() {
        return personaje2;
    }
}
