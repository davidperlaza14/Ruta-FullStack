package Mediator;

public class ColegaConcreto1 extends Colega{
    @Override
    void recibe() {
        System.out.println("He recibido un mensaje, soy colega concreto1 ");
    }

    @Override
    void envia() {
        System.out.println("Soy colega concreto1, envio un mensaje ");
        mediator.reenvia(this);
    }
}
