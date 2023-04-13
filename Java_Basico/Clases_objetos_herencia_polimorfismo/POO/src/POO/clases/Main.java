package POO.clases;

import POO.herencia.Camion;
import POO.herencia.Coche;
import POO.herencia.Motocicleta;

public class Main {

    public static void main(String[] args) {



        // 1. clases y objetos

        // Clase identificador = new Clase();

        // crear un objeto utilizando el constructor vacio
         Vehiculo toyotaPrius = new Vehiculo();

         // crear un objeto utilizando el constructor con parametros
        Motor motorGTI = new Motor("GTI", 190, 559.0, 6);
        Vehiculo fordMondeo = new Vehiculo("Ford", "Mondeo", 2.1, 2010, false, 0,motorGTI);

        System.out.println(fordMondeo.fabricante);
        System.out.println(fordMondeo.year);
        System.out.println(fordMondeo.speed);
        fordMondeo.acelera(50);
        System.out.println(fordMondeo.speed);

        // 2. herencia
        Motocicleta mt09 = new Motocicleta();
        mt09.fabricante = "Yamaha";

        System.out.println(mt09.fabricante);

        System.out.println("fin programa.");


        // 3. polimorfismo
        Vehiculo vehiculo;
        vehiculo = new Motocicleta();
        vehiculo.acelera(50);


        vehiculo = new Coche();
        vehiculo.acelera(50);

        vehiculo = new Camion();
        vehiculo.acelera(50);


        // 4. clses abstractas: no se pueden instanciar, solo instancian las clases hijas.




    }
}
