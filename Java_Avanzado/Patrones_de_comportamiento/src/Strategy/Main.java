package Strategy;

public class Main {

    public static void main(String[] args) {
        UsuariosMemoria usuarios = new UsuariosMemoria();
        usuarios.crear("fulano");
        usuarios.crear("menganoano");
        usuarios.crear("pepe");

        for (String usuario : usuarios.listar()
             ) {
            System.out.println(usuario);
        }
    }
}
