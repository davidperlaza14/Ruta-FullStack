package Factory;

public class Main {
    public static void main(String[] args) {
        Factory factory = new Factory("España");
        System.out.println("El precio para España es: " + factory.getPrecio());

        Factory factory2 = new Factory("usa");
        System.out.println("El precio para USA es: " + factory2.getPrecio());

        Factory factory3 = new Factory("UK");
        System.out.println("El precio para GBP es: " + factory3.getPrecio());
    }
}
