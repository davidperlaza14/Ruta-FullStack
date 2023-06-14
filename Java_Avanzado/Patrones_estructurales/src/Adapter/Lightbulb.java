package Adapter;

public class Lightbulb{
    boolean powerendOn = false;
    int voltage = 0;

    public void turnOn(int voltage){
        this.powerendOn = true;
        this.voltage = voltage;
    }

    public void turnOff(){
        this.powerendOn = false;
    }

    public boolean isPowerendOn() {
        return powerendOn;
    }
}
