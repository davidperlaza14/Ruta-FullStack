package Mediator;

public class ColegaConcreto2 extends Colega{
    @Override
    void recibe() {
        System.out.println("He recibido un mensaje, soy colega concreto2 ");
    }

    @Override
    void envia() {
        System.out.println("Soy colega concreto2, envio un mensaje ");
        mediator.reenvia(this);
    }
}
