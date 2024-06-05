import javax.swing.*;
import java.awt.*;

public class Ventanas extends JFrame {
    private final Juego juego;
    private JButton iniciarCombateButton;
    private JTextArea textArea1;

    public Ventanas() {
        this.juego = new Juego();

        // Configuración de la ventana
        setSize(450, 500);

        // Area de texto
        textArea1.setEditable(false);
        add(new JScrollPane(textArea1), BorderLayout.CENTER);

        // Botón de inicio
        iniciarCombateButton.addActionListener(e -> juego.iniciarCombate(textArea1));
        add(iniciarCombateButton, BorderLayout.SOUTH);
    }
}
