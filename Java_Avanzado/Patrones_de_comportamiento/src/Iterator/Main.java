package Iterator;

public class Main {
    public static void main(String[] args) {
        Usuarios usuarios = new Usuarios();
        usuarios.crear(new Usuario("Uno",14));
        usuarios.crear(new Usuario("Dos",19));
        usuarios.crear(new Usuario("Tres",17));
        usuarios.crear(new Usuario("Cuatro",24));

        while (usuarios.hayMas()) {
            Usuario usuario = usuarios.siguiente();
            System.out.println("Usuario es " + usuario.getNombre());
        }
    }
}
