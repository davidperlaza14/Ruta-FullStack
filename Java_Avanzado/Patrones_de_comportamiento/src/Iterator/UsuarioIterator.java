package Iterator;

public interface UsuarioIterator {
//    Hay mas usuarios en el iterador
    boolean hayMas();

//    Reinicia el contador (el iterador)
    void reiniciar();

//    Obtene el siguiente
    Usuario siguiente();

}
