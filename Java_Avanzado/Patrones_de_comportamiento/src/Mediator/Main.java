package Mediator;

public class Main {

    public static void main(String[] args) {
        Mediator mediator = new MediadorConcreto();

        Colega colega = new ColegaConcreto1();
        Colega colega2 = new ColegaConcreto2();
        Colega colega3 = new ColegaConcreto3();

        mediator.registra(colega);
        mediator.registra(colega2);
        mediator.registra(colega3);

        colega.envia();
        colega2.envia();
        colega3.envia();



    }
}
