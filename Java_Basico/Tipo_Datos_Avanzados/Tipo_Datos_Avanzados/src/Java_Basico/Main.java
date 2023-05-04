package Java_Basico;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Vector;

public class Main {

    public static void main(String[] args) {
        String cadena = "Mensaje de texto";

//        int cadenaLen = cadena.length();
//        //System.out.println("La longuitud de mi cadena es de: " + cadenaLen);
//
//        String cadenaMayus = cadena.toUpperCase();
//        //System.out.println("La cadena ahora es:  " + cadenaMayus);
//
//        String cadenaMinu = cadena.toLowerCase();
        //System.out.println("La cadena ahora es:  " + cadenaMinu);

        //boolean resultado = cadena.startsWith("Men");
//        boolean resultado = cadena.endsWith("Men");
//        if (resultado) {
//            System.out.println("Empieza por lo que busco");
//        } else {
//            System.out.println("No empieza por lo que busco. ");
//        }
//        char letra = cadena.charAt(4);
//        System.out.println("Caracter es:" + letra);

//        for (int i = 0; i < cadena.length(); ++i) {
//            System.out.println(i + " Caracter actual: " + cadena.charAt(i));
//        }



//        ARRAYS


//        int arrayUno[] = new int[5];
//        arrayUno[0] = 1;
//        arrayUno[1] = 2;
//        arrayUno[2] = 3;
//        arrayUno[3] = 4;
//        arrayUno[4] = 5;
//        int arrayUno[] = {1,2,3,4,5};
//        for (int i : arrayUno) {
//            System.out.println(i);
//        }
//        String nombres[] = {
//                "Pepe",
//                "Juan",
//                "Pacho"
//        };
//        for (String nombre : nombres) {
//            System.out.println("Nombre actual: " + nombre);
//        }
//
//        for (int i = 0; i < nombres.length; i++) {
//            System.out.println("Nombre actual: " + nombres[i] + "en posicion: " + i );
//        }

//        int arrayBidi[][] = new int[2][4];
//        arrayBidi[0][0] = 1;
//        arrayBidi[0][1] = 2;
//        arrayBidi[0][2] = 3;
//        arrayBidi[0][3] = 4;
//
//        arrayBidi[1][0] = 10;
//        arrayBidi[1][1] = 20;
//        arrayBidi[1][2] = 30;
//        arrayBidi[1][3] = 40;
//
//        for (int i = 0; i < arrayBidi.length; i++) {
//            System.out.println("Valor de i: " + i);
//            for (int j = 0; j < arrayBidi[0].length; j++) {
//                System.out.println("Estoy en i = " + i + ", j = " + j);
//                System.out.println(arrayBidi[i][j]);
//            }
//        }

//        ==========VECTORES==========

//        Vector<Integer> vector = new Vector<>(50);
//        vector.add(27);
//        vector.add(28);
//        vector.add(29);
//        System.out.println("Datos del vector: " + vector);
//
////        vector.remove(2);
////        System.out.println("Datos del vector: " + vector);
//        System.out.println("Vector Tamaho: " + vector.size() + " y capacidad: " + vector.capacity());




//        =========ArrayList========

        ArrayList<String> lista = new ArrayList<>();
        lista.add("ElementoA");
        lista.add("ElementoB");
        lista.add("ElementoC");

//        lista.remove("ElementoB");
//        System.out.println("Contenido: " + lista);
//        for (String nombre : lista) {
//            System.out.println(nombre);
//        }
//
//        for (int i = 0; i < lista.size(); i++) {
//            System.out.println(lista.get(i));
//        }

//       ======== Diferencias entre ArrayList y LinkedList ========
//        LIFO Y FIFO



//        ======== BigDecimal ========
//        BigDecimal valorA = new BigDecimal(0.1f);
//        BigDecimal valorB = new BigDecimal(10);
//
////        Suma el BigDecimal "valorB"  a "valorA"
//        BigDecimal resultado = valorA.add(valorB);
////        Imprime la suma
//        System.out.println(resultado.toString());

//        ======== MAP ========
        HashMap<String, Integer> mapa = new HashMap<>();
        mapa.put("clave1",10);
        mapa.put("clave2",20);
        mapa.put("clave3",30);

        for (Map.Entry elemento : mapa.entrySet()) {
            System.out.println("Elemeto llave es: " + elemento.getKey());
            System.out.println("Elemeto valor es: " + elemento.getValue());

        }









    }
}