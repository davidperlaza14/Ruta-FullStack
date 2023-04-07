package Java_Basico;

/**
 * Para este ejercicio tendréis que crear una función que reciba un precio y devuelva el precio con el IVA incluido.
 * @author David STiven
 *
 */
public class Entrega_ejercicios_tema_2 {

    public static void main(String[] args) {

        double precio = getPrecio(160.56);
        System.out.println(precio);
    }

    static double getPrecio(double costo) {
        return costo + 19;
    }
}
