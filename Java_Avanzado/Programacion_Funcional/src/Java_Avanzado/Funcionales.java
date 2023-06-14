package Java_Avanzado;

import java.util.function.Function;

public class Funcionales {

    private static Function<String, String> toMayus = (x) -> x.toUpperCase();
    private static Function<Integer, Integer> sumador = (x) -> x.sum(x, x);

    public void pruebas() {
        System.out.println(toMayus.apply("David"));
        System.out.println(sumador.apply(5));
    }


}
