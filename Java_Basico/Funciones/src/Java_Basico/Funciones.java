package Java_Basico;

public class Funciones {

    public static void main(String[] args) {

        // Opcion 1: funcion sin parametros y  sin tipo de retorno.
        showMenu();
        showMenu();

        // Opcion 2:  funcion sin parametros y con tipo de retorno.
        String menu = getMenu();
        System.out.println(menu);
        System.out.println(getMenu());

        double price = getPrice();
        System.out.println(price);


        // opcion 3: funcion con parametros y sin tipo de retorno
        imprimirSaludo("OpenBootCamp");


        //opcion 4: funcion con parametros y con  tipo de retorno
        String nombre = "David";
        String apellido = "Perlaza";
        String saludo = obtenerSaludo(nombre, apellido);
        System.out.println(saludo);

        int resultadoSuma = suma(50, 10);
        System.out.println(resultadoSuma);
    }

    static int suma(int num1, int num2) {
        return num1 + num2;
    }


    static String obtenerSaludo(String nombre, String apellido) {
        return "Buenos dias " +  nombre + " " + apellido;
    }

    static void imprimirSaludo(String nombre) {
        System.out.println("Buenas tares " + nombre);
    }

    static double getPrice() {
        return 100.99;
    }

    /**
     * opcion 1
     * void indica que no devuelte nada
     */
    static void showMenu(){
        System.out.println("Bienvenido al E-commerce de zapatillas");
        System.out.println("1 - Ver zapatillas");
        System.out.println("2 - Comprar  zapatillas");
        System.out.println("1 - Salir");

    }

    static  String getMenu(){
        return "Bienvenido al E-commerce de zapatillas \n 1 - Ver zapatillas";
    }
}
