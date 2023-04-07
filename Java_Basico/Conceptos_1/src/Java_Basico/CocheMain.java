package Java_Basico;

/**
 * @author David
 * Creando Objects e instances
 */
public class CocheMain {


    public static void main(String[] args) {


        String coche =  "Alfa romeo";
        Coche cocheObj = new Coche("honda ");


        Coche cocheObj2 = new Coche("roja", "honda", "civic", 1430.45, 5.4);
        cocheObj2.acelerar(50);
        System.out.println(cocheObj2);


        cocheObj2.peso = 1666.27;
        System.out.println(cocheObj2);

        CocheElectrico cocheElectrico = new CocheElectrico();
        cocheElectrico.motorElectrico = "Ejemplo motor";
        cocheElectrico.color = "verde";
        cocheElectrico.fabricante = "honda";
        cocheElectrico.modelo = "civic";

        System.out.println(cocheElectrico);

        CocheHibrido cocheHibrido = new CocheHibrido();
        cocheHibrido.motorHibriElectric = "Electrico y de combustion";
        cocheHibrido.color = "Negro";
        cocheHibrido.fabricante = "BMW";
        cocheHibrido.modelo = "X6";

        System.out.println(cocheHibrido);

        CocheElectrico cocheElectrico2 = new CocheElectrico("Azul","alf","civic",
                1234.55,4.5, "V8");
        System.out.println(cocheElectrico2);

        cocheElectrico2.acelerar(50);
        System.out.println(cocheElectrico2);

    }
}
