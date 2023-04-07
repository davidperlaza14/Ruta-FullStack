package Java_Basico;

/**
 * @author David Perlaza
 * created an class Coche
 */
public class Coche {

    // atributos
    String color;
    String fabricante;
    String modelo;
    Double peso;
    Double largo;
    Integer velocida = 0;

    // constructores
    public Coche(String color, String fabricante, String modelo, Double peso, Double largo){
        this.color = color;
        this.fabricante = fabricante;
        this.modelo = modelo;
        this.peso = peso;
        this.largo = largo;

    }

    public Coche(String honda) {

    }



    // comportamiento

    public void acelerar(Integer cantidad){
        if (cantidad > 0 && cantidad <= 121){
            this.velocida += cantidad;
        }
    }

    @Override
    public String toString() {
        return "Coche{" +
                "color='" + color + '\'' +
                ", fabricante='" + fabricante + '\'' +
                ", modelo='" + modelo + '\'' +
                ", peso=" + peso +
                ", largo=" + largo +
                ", velocida=" + velocida +
                '}';
    }
}
