package POO.Entrega_ejercicios_tema_4;

public class Main {

    public static void main(String[] args) {

        SmartPhone iphone = new SmartPhone("Apple","8plus","negro",true);
        System.out.println(iphone.fabricante);

        SmartWatch samsungWatch = new SmartWatch();
        samsungWatch.fabricante = "Samsung";
        System.out.println(samsungWatch.fabricante);


    }
}
