package Java_Basico;

/**
 * @author David
 * created herences
 */
public class CocheHibrido extends Coche{

    String motorHibriElectric;

    public CocheHibrido() {
        super("honda ");
    }
    public CocheHibrido(String motorHibriElectric) {
        super("honda ");
        this.motorHibriElectric = motorHibriElectric;
    }

    @Override
    public String toString() {
        return "CocheHibrido{" +
                "motorHibriElectric='" + motorHibriElectric + '\'' +
                ", color='" + color + '\'' +
                ", fabricante='" + fabricante + '\'' +
                ", modelo='" + modelo + '\'' +
                ", peso=" + peso +
                ", largo=" + largo +
                ", velocida=" + velocida +
                '}';
    }
}