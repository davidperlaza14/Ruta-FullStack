package Privacidad_abstracción_y_encapsulación;

public class Main {
  public static void main(String[] args) {
    Vehiculo coche = new Vehiculo();
    coche.setTipo("Coupe");
    coche.setVelocidadaMaxima(120);

    Vehiculo moto = new Vehiculo();
    moto.setTipo("Scotter");
    moto.setVelocidadaMaxima(50);


    System.out.println(coche.getTipo());
    System.out.println(moto.getVelocidadaMaxima());
    System.out.print(moto.getTipo() + " " + moto.getVelocidadaMaxima());




    // Vehiculo vehiculo = new Vehiculo();
    // vehiculo.tipo = "Coche";
    // System.out.println(vehiculo.tipo);


    // Vehiculo vehiculo = new Vehiculo();
    // vehiculo.setTipo("Coche");
    // String tipo = vehiculo.getTipo();
    // System.out.println(tipo);


    // vehiculo.tipo = "Coche";
    // System.out.println(vehiculo.tipo);
  }
}

/**
 * Vehiculo
 */
class Vehiculo {

  private String tipo;
  private int velocidadaMaxima;

  public void setVelocidadaMaxima(int velocidadaMaxima) {
    this.velocidadaMaxima = velocidadaMaxima;
  }

  public int getVelocidadaMaxima() {
    return this.velocidadaMaxima;
  }


  public void setTipo(String valor) {
    this.tipo = valor;
  }

  public String getTipo() {
    return this.tipo;
  }
}