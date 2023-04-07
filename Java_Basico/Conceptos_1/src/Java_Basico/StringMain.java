package Java_Basico;

public class StringMain {

    public static void main(String[] args) {

        // La clase String

        /*
            length()
            startsWith("")
            endsWith("")
            indexOf("")
            subString(1,5)
            strm()
            equals()
            compareTo()

         */

        String mensaje = "   Hola mundo  ";

        System.out.println(mensaje.length());
        String mensajeMay = mensaje.toUpperCase();
        System.out.println(mensajeMay);
        System.out.println(mensajeMay.trim());
        mensajeMay = mensajeMay.trim();

        String otro = "hola mundo";
        if (mensajeMay.equalsIgnoreCase(otro)){
            System.out.println("Verdadero!!");
        }




    }
}
