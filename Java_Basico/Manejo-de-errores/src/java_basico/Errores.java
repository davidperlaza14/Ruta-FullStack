package java_basico;

import java.util.Scanner;

public class Errores {
    public static void main(String[] args) {

        /*
         * Error de compilacion
         * porque la division por cero no esta definida
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce dos numeros: ");

        int numA = scanner.nextInt();
        int numB = scanner.nextInt();

        int resultado = numA / numB;
        System.out.println("Resultado es:  " + resultado);

        /*
         * Error logico
         * Nuestra logica a la hora de codificar es incorrecta
         */
//        @SuppressWarnings("always")
        int temperatura = 25;
        if (temperatura >= 25) {
            System.out.println("Hace frio");
        }
    }
}