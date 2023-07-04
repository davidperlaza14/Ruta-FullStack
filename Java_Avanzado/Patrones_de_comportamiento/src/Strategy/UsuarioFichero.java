package Strategy;

import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.ArrayList;

public class UsuarioFichero {

    private String ficheroUsuario = "usuario.txt";
    private PrintStream fichero;

    public UsuarioFichero() {
        try {
            fichero = new PrintStream(ficheroUsuario);
        } catch (Exception e) {
            System.out.println("No puedo abrirlo: " + e.getMessage());
        }
    }

    public ArrayList<String> lista
}
