package Java_Basico;

public class ContinueBreak {

    public static void main(String[] args) {

        int cout = 0;
        while (cout < 10){
            cout++; // condicion
            if (cout == 6)
//                break; // rompe el flujo de ejecucion
                continue; // salta el valor 6 y continua la ejecucion
            System.out.println("Hola Mundo! " + cout );

        }
        System.out.println("FIN");

    }
}
