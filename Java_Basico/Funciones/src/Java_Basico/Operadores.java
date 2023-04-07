package Java_Basico;

public class Operadores {

    public static void main(String[] args) {

        // Aritmetricos:
        int numero1 = 10;
        int numero2 = 20;
        int resultadoSuma = numero1 + numero2;

        System.out.println(resultadoSuma);
        System.out.println(resultadoSuma + 5.77);

        int resultadoResta = numero1 - numero2;
        System.out.println(resultadoResta);

        /*
        Comparacion:
        > mayor que
        < menor que
        >= mayor igual que
        <= menor igual que
        == igual que
         */
        boolean resultado1 = numero1 < numero2;
        boolean resultado2 = numero1 > numero2;

        System.out.println(resultado1);
        System.out.println(resultado2);

        /*
        Logicos
        and &&
        or ||

         */
        boolean resultado3 = numero1 > 5 && numero2 < 30;
        System.out.println(resultado3);

        int edad = 17;
        boolean carnetJoven = edad >= 15 && edad <= 26;
        System.out.println(carnetJoven);
    }
}
