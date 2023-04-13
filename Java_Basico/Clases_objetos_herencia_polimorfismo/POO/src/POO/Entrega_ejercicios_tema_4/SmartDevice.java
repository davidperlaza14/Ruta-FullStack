package POO.Entrega_ejercicios_tema_4;

public class SmartDevice {

    String fabricante;
    String modelo;
    String color;
    boolean pantallaTactil;

    public SmartDevice(String fabricante, String modelo, String color, boolean pantallaTactil){
        this.fabricante = fabricante;
        this.modelo = modelo;
        this.color = color;
        this.pantallaTactil = pantallaTactil;
    }


    public SmartDevice() {

    }
}

class SmartPhone extends SmartDevice{
    boolean wifi;


    public SmartPhone(){

    }
    public SmartPhone(String fabricante, String modelo, String color, boolean pantallaTactil) {
        super(fabricante, modelo, color, pantallaTactil);
    }
}

class SmartWatch extends SmartDevice{
    boolean radio;

    public  SmartWatch(String fabricante, String modelo, String color, boolean pantallaTactil) {
        super(fabricante, modelo, color, pantallaTactil);
    }

    public SmartWatch() {

    }
}
