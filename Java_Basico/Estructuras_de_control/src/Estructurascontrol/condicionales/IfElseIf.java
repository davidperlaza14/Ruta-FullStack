package Estructurascontrol.condicionales;

public class IfElseIf {

    public static void main(String[] args) {

        String dia = "djhs";

        if (dia.equals("Lunes")) {
            System.out.println("Animo con la semana Champions");

        } else if (dia.equals("Martes")) {
            System.out.println("Martes con M de Me besas");

        } else if (dia.equals("Miercoles")) {
            System.out.println("Miercoles con M de Me besas");

        } else if (dia.equals("Jueves")) {
            System.out.println("Ya es juernes");

        } else if (dia.equals("Viernes")) {
            System.out.println("Nos fuimos!");

        } else if (dia.equals("Sabado")) {
            System.out.println("Nos murimos!");

        } else if (dia.equals("Domingo")) {
            System.out.println("Depresion");
        } else {
            System.out.println("No es un dia de la semana");
        }


    }
}
