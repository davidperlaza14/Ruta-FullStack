package Adapter;

public class AdaptadorIngles implements Enchufable{
    public Lightbulb lightbulb = new Lightbulb();

    @Override
    public void enciende() {
        lightbulb.turnOn(110);
    }

    @Override
    public void apaga() {
        lightbulb.turnOff();

    }

    @Override
    public boolean tieneCorriente() {
        return lightbulb.isPowerendOn();
    }
}
