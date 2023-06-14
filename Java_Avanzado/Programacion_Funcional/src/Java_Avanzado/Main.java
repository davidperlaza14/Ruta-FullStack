package Java_Avanzado;

public class Main {

    /**
     * Functiones puras
     */
    private static int contador = 0;

    public static void main(String[] args) {
        double result = suma(1,2);
        double result2 = suma(1,2);
        System.out.println(result + "  " + result2);
        System.out.println(contador);


    }

    public static double suma(int a, int b) {
//        contador += 1;
        double sumador = Math.random();
        return (double) a + (double) b + sumador;
    }

    public static int multiplica(int a, int b) {
        return a + b;
    }

}
