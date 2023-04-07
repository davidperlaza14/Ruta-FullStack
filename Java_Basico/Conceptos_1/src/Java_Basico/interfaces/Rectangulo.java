package Java_Basico.interfaces;

public class Rectangulo implements  Figura{

    int ancho, alto;


    public Rectangulo (int ancho, int alto) {
        this.ancho = ancho;
        this.alto = alto;
    }

    @Override
    public int area() {
        return ancho * alto;
    }
}
