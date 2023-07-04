package Mediator;

public class ColegaConcreto3 extends Colega{
    @Override
    void recibe() {
        System.out.println("He recibido un mensaje, soy colega concreto3 ");
    }

    @Override
    void envia() {
        System.out.println("Soy colega concreto3, envio un mensaje ");
        mediator.reenvia(this);
    }
}

