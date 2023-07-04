package Observer;

public class Main {
    public static void main(String []args){
        Emisora emisora = new Emisora();

        ReceptorTV tv = new ReceptorTV();
        ReceptorRadio radio = new ReceptorRadio();
        ReceptorSatelite set = new ReceptorSatelite();

        emisora.meteReceptor(tv);
        emisora.meteReceptor(radio);
        emisora.meteReceptor(set);

        emisora.emite();
    }
}
