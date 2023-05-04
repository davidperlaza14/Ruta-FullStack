package java_basico;

import java.util.Scanner;

public class gestionarErrores {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce dos numeros: ");

        int numA = scanner.nextInt();
        int numB = scanner.nextInt();

        try {
            int resultado = numA / numB;
            System.out.println("Resultado es:  " + resultado);
        } catch (ArithmeticException e) {
            System.out.println("BOOM!!, excepcion es: " + e.getClass());
        } finally {
            System.out.println("finally");
        }

    }
}
