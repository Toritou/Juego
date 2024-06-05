import javax.swing.SwingUtilities;

public class Main {
    public static void main(String[] args) {
        // Inicia la ventana del juego
        SwingUtilities.invokeLater(() -> {
            Ventanas ventana = new Ventanas();
            ventana.setVisible(true);
        });
    }
}
