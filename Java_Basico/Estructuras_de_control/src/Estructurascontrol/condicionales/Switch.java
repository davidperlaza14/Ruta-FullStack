package Estructurascontrol.condicionales;

public class Switch {

    public static void main(String[] args) {

        String dia = "Viernkes";
        switch (dia){
            case "Lunes":
                System.out.println("Hoy es LUnes");
                break;
            case "Martes":
                System.out.println("Hoy es Martes");
                break;
            case "Miercoles":
                System.out.println("Hoy es Miercoles");
                break;
            case "Jueves":
                System.out.println("Hoy es Jueves");
                break;
            case "Viernes":
                System.out.println("Hoy es Viernes");
                break;
            case "Sabado":
                System.out.println("Hoy es Sabado");
                break;
            case "Domingo":
                System.out.println("Hoy es Domingo");
                break;
            default:
                System.out.println("No es un dia de la semana");
        }
    }
}
