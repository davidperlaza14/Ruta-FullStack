package ejercicio678;

public class Main {
    public static void main(String[] args) {
        SoyUnico ivan = SoyUnico.getSingletonInstance("ivan Andres");
//        SoyUnico david = SoyUnico.getSingletonInstance("David Stiven");

        // ivan y david son referencias a un único objeto de la clase SoyUnico
        System.out.println(ivan.getNombre());
//        System.out.println(david.getNombre());

//        Veamos que pasa si intentamos clonar el objeto de la clase "SoyUnico":
        try {
            SoyUnico yeison = ivan.clone();
            System.out.println(yeison.getNombre());
        }catch (NullPointerException ex) {
            ex.printStackTrace();
        }
    }

}
