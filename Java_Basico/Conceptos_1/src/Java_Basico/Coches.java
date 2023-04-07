package Java_Basico;

public class Coches {

    String name = "NOmbre de COCHE";

    public Coches(){}
    public Coches(String name){
        this.name = name;
    }

    @Override
    public String toString() {
        return "Coches{" +
                "name='" + name + '\'' +
                '}';
    }
}
