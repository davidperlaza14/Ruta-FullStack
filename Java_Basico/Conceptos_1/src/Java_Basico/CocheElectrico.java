package Java_Basico;

public class CocheElectrico  extends Coche{

    String motorElectrico;

    public  CocheElectrico(){
        super("honda ");
    }
    public CocheElectrico(String motorElectrico){
        super("honda ");
        this.motorElectrico=motorElectrico;
    }

    public CocheElectrico(String color, String fabricante, String modelo, Double peso, Double largo, String motorElectrico){
        super(color, fabricante, modelo, peso, largo);
        this.motorElectrico = motorElectrico;
    }

    public void acelerar(Integer cantidad){
        Integer cantidadAjustada = cantidad * 2;
        super.acelerar(cantidadAjustada);
    }

    @Override
    public String toString() {
        return "CocheElectrico{" +
                "motorElectrico='" + motorElectrico + '\'' +
                ", color='" + color + '\'' +
                ", fabricante='" + fabricante + '\'' +
                ", modelo='" + modelo + '\'' +
                ", peso=" + peso +
                ", largo=" + largo +
                ", velocida=" + velocida +
                '}';
    }
}
