package Java_Basico;

//import java.util.Scanner;

import java.util.ArrayList;
import java.util.Vector;

public class Ejercicios7_8_9 {

    /*Escribe el código que devuelva una cadena al revés. Por ejemplo, la cadena
    "hola mundo", debe retornar "odnum aloh".
    */
//    public static class Reves {

//        public static void main(String[] args) {

//            System.out.println(" ============ Cadena al Reves ============ ");
//
//            Scanner scanner = new Scanner(System.in);
//            String texto;
//            System.out.println("Introduce un texto: ");
//            texto = scanner.nextLine();
//
//            StringBuilder reves = new StringBuilder(texto);
//            texto = reves.reverse().toString();
//
//            System.out.println(texto);

//        }
//    }
//

    /*
     Crea un array unidimensional de Strings y recórrelo,mostrando únicamente sus valores.
     */

//    public static class arrayUnidimensional {
//
//        public static void main(String[] args) {
//
//            System.out.println(" ============ Array Unidimensional ============ ");
//
//            String ciencias[] = {"Quimica", "Fisica", "Biologia"};
//            for (String ciencia : ciencias ) {
//                System.out.println(ciencia);
//            }
//        }
//    }

    /*
    Crea un array bidimensional de enteros y recórrelo, mostrando
    la posición y el valor de cada elemento en ambas dimensiones.
    */

//    public static class ArrayBidimensional {
//
//        public static void main(String[] args) {
//
//            System.out.println("======== Array Bidimensional ========");
//
//            Integer [][] numeros = {
//                    {10, 11, 13},
//                    {20, 21, 23}
//            };
//
//            for (int i = 0; i < numeros.length; i++) {
//                for ( int j = 0; j < numeros.length; j++) {
//
//                    System.out.println("Fila: " + (i + 1) + " | Columna: " + (j + 1) +
//                            "\nEl valor es: " + numeros[i][j] + "\n");
//                }
//            }
//        }
//    }

    /*
    Crea un "Vector" del tipo de dato que prefieras, y añádele 5 elementos.
    Elimina el 2o y 3er elemento y muestra el resultado final.
    */

//    public static class exmVector {
//
//        public static void main(String[] args) {
//
//            System.out.println("========== Vector ==========");
//
//            Vector vector = new Vector();
//
//            vector.add(1);
//            vector.add(2);
//            vector.add(3);
//            vector.add(4);
//
//            System.out.println("Vector antes de borrar: " + vector);
//
//            vector.remove(2);
//            vector.remove(1);
//
//            System.out.println("Vector despues de borrar: " + vector + " -> Eliminados el 2 y 3");
//
//
//
//        }
//    }


        /* Indica cuál es el problema de utilizar un Vector con la capacidad por defecto si tuviésemos
           1000 elementos para ser añadidos al mismo.
        */
//        public static class capacidadVector {
//
//            public static void main(String[] args) {
//                System.out.println("======== Respuesta ========");
//
//                System.out.println("Desperdiciamos mucha memoria del sistema, ya que cada vez que se sobrepasa" +
//                        " el limite establecido (Por defecto, 10) la dimension del vector se duplica.");
//            }
//        }


        public  static class ArrayString {
                public static void main(String[] args) {

                        System.out.println("========== Array y LinkedList ==========");

                        ArrayList<String> lista = new ArrayList<String>();
                        lista.add("David");
                        lista.add("Stiven");
                        lista.add("Ivan");
                        lista.add("Juan");
                        
                }
        }


}
