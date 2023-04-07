package Java_Basico.interfaces;

public class Main {

    /**
     *
     * @param args
     *
     */
    public static void main(String[] args) {
        Rectangulo r1;
        Triangulo t1;

        r1 = new Rectangulo(7,5);
        t1 = new Triangulo(4,7);
        System.out.println("El area del rectangulo es: " + r1.area());
        System.out.println("El area del triangulo es: " + t1.area());
    }
}
