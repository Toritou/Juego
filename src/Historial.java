import java.io.FileWriter;
import java.io.IOException;

public class Historial {
    private final String archivo;

    public Historial(String archivo) {
        this.archivo = archivo;
    }

    public void registrar(String contenido) {
        try (FileWriter writer = new FileWriter(archivo, true)) {
            writer.write(contenido);
            writer.write("-----------------------------------------------------------");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
