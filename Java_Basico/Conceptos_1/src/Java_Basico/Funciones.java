package Java_Basico;

public class Funciones {


    public static void main(String[] args) {
        
//        holaMundo();
        holaMundo(6);
        holaMundo("Perlaza");

//        holaMundo("DAVID");
//        holaMundo("STiven");

       // String hola = devolverHola();
        //System.out.println(hola);
    }



    public static void holaMundo() {
        System.out.println("Hola mundo desde un metodo");
        System.out.println("Hola mundo ");
    }

    public static void holaMundo(String name) {
        System.out.println("Hola mundo " + name);
    }

    private static void holaMundo(Integer number) {
        System.out.println("El numero es: " + number);
    }
    private static String devolverHola() {
        return "Hola";
    }


}
