package Iterator;

public class Usuario {
    private String nombre;
    private int edad;

    private Usuario() {}
    Usuario(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }
    public int getEdad() {
        return edad;
    }
}
