package refactor;

import java.util.Arrays;

public class Main {

    public static void main(String[] args){
        ConstructorLargoBuilder cosa  = new ConstructorLargoBuilder("marca")
                .conModelo("b")
                .conMotor("electrico")
                .conPuertas(5);
    }
















//        int []numeros = {12, 23, 45, 1, 9};
//        imprimeMayorYMenor(numeros);
//    }
//
//    public static void imprimeMayorYMenor(int[] numeros) {
////        int mayor = 0;
////        int menor = numeros[0];
//
//        int mayor = Arrays.stream(numeros).reduce(0, (a, b) -> a > b ? a : b);
//        int menor = Arrays.stream(numeros).reduce(numeros[0], (a, b) -> a < b ? a : b);
//
////        for (int i = 0; i < numeros.length; i++) {
////            if (mayor < numeros[i]) {
////                mayor = numeros[i];
////            }
////            if (menor > numeros[i]) {
////                menor = numeros[i];
////            }
////        }
//        System.out.println("Mayor: " + mayor + " y menor: " + menor);
//    }
}
