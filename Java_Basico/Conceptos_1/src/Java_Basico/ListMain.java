package Java_Basico;

import java.util.ArrayList;
import java.util.List;

public class ListMain {


    public static void main(String[] args) {

        List<String> nombres = new ArrayList<>();

        nombres.add("Nombre 1");
        nombres.add("Nombre 2");
        nombres.add("Nombre 3");
        nombres.add("Nombre 4");
        nombres.add("Nombre 5");


        System.out.println(nombres);

        for(String nombre : nombres) {
            System.out.println(nombre);
        }

        List<Coches> coches = new ArrayList<>();

        coches.add(new Coches("honda "));
        coches.add(new Coches("alfa romeo "));
        coches.add(new Coches("Lambo "));

        System.out.println(coches);

    }
}
