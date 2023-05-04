package Java_Basico;

import java.io.*;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        try {
            InputStream in = new FileInputStream("/etc/passwd");
            byte []datos = in.readAllBytes();
            in.close();

            PrintStream out = new PrintStream("destino.txt");
            out.write(datos);
            out.close();


        } catch (Exception e) {
            System.out.println("Excepcion: " + e.getMessage());
        }


//        Scanner
//        try {
//            boolean ok = false;
//            do {
//                Scanner scanner = new Scanner(System.in);
//                System.out.println("Mete dos numeros: ");
////                scanner.reset();
//                try {
//                    int a = scanner.nextInt();
//                    int b = scanner.nextInt();
//                    ok = true;
//                } catch (InputMismatchException e ) {
//                    System.out.println("Numeros invalidos");
//                }
//            } while (!ok);
//        } catch (Exception e) {
//            throw new RuntimeException(e);
//        }
//
//
//
//
////      ==========  PrintStream ==========
//        PrintStream info = new PrintStream("copia.txt");
//        info.println("Hola");
////        -rw-rw-r--  1 davidperlaza14 davidperlaza14    5 abr 27 11:09 copia.txt
////          Hola
//
//
//
////         ==========  InputStream ==========
//        try {
//            InputStream fichero = new FileInputStream("/etc/passwd");
//            try {
//                byte []datos = fichero.readAllBytes();
//                for (byte dato : datos) {
//                    System.out.println((char) dato);
//                }
//            } catch (IOException e) {
//                System.out.println("No he podido leer el programa: " + e.getMessage());
//            }
//
//        } catch (FileNotFoundException e) {
//            System.out.println("Oye, que el programa da error: " + e.getMessage());
//        }


    }
}
