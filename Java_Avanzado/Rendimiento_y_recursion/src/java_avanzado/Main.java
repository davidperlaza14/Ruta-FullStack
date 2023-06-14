package java_avanzado;

import java.util.stream.IntStream;

public class Main {

    public static void main(String[] args) {
        long tiempoInicial = System.currentTimeMillis();
        for (int i = 0; i <= 1000000; i++) {
            sumaRecursiva(100);
        }
        long tiempoFinal = System.currentTimeMillis();
        System.out.println("MS en total: " + (tiempoFinal - tiempoInicial));
//        System.out.println("Suma iterativa: " + suma(5));
//        System.out.println("Suma recursiva: " + sumaRecursiva(5));
//        System.out.println("Suma funcional: " + sumaFuncional(5));
//
//
//        System.out.println("Factorial iterativa: " + factorial(5));
//        System.out.println("Factorial recursiva: " + factorialRecursivo(5));
//        System.out.println("Factorial funcional: " + factorialFuncional(5));
//        headRecursion(5);
//        tailRecursion(5)
//        1+2+3+4+5 = 15
//        System.out.println(suma(5));
//        System.out.println(sumaRecursiva(5));
    }

    public static int factorial(int numero) {
        int resultado = 1;

        for (int i = 1; i <= numero; i++) {
            resultado = resultado * i;
        }
        return resultado;
    }

    public static int factorialRecursivo(int numero) {
        if (numero == 0) {
            return 1;
        }
        return numero * factorialRecursivo(numero - 1);
    }

    public static int factorialFuncional(int numero) {
        return IntStream.rangeClosed(1, numero)
                .reduce(1, (a, b) -> a * b);
    }

    // -> 5
    //  -> 5 - 1
    //      -> 4 - 1
    //        -> 3 - 1
    //           -> 2 - 1
    //               -> 1 - 1
    //                  -> 0 - 1
    //                     -> -1 - 1
    public static int sumaRecursiva(int numero) {
        if (numero == 1) {
            return 1;
        }
        return numero + sumaRecursiva(numero - 1);
    }

    public static int sumaFuncional(int numero) {
        return IntStream.rangeClosed(1, 5)
                .reduce(0, (a, b) -> a + b);


    }

    public static void tailRecursion(int valor) {
        if (valor == 0) {
            return;
        }
        System.out.println(valor);
        tailRecursion(valor - 1);
    }

    public static void headRecursion(int valor) {
        if (valor == 0) {
            return;
        }

        headRecursion(valor - 1);
        System.out.println(valor);
    }
    public static int suma(int max) {
        int resltado = 0;

        for (int i = 0; i <= max; i++) {
            resltado += i;
        }
        return resltado;
    }
}
