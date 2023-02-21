package Introducción_a_la_Programación_Orientada_a_Objetos;

public class Main {
  public static void main(String[] args) {
    Coche coche = new Coche();
    System.out.println(coche.nuemroDePuertas);
    System.out.println(coche.velocidadMaxima);
    System.out.println(coche.velocidadActual);
    // coche.acelera();
    // System.out.println(coche.velocidadActual);
    // coche.decelerar();

    Coche coche2 = new Coche(5, 140);
    System.out.println(coche2.nuemroDePuertas);
    System.out.println(coche2.velocidadMaxima);
    System.out.println(coche2.velocidadActual);
  }
}


/**
 * Coche
 */ 
class Coche {
  int nuemroDePuertas;
  int velocidadMaxima;
  float velocidadActual;

  public Coche() {
    nuemroDePuertas = 5;
    velocidadMaxima = 120;
    System.out.println("Estoy en el constructor SIN PARAMETROS");
  }

  public Coche(int puertas, int velocidad) {
    nuemroDePuertas = puertas;
    velocidadMaxima = velocidad;
    System.out.println("Estoy en el constructor CON PARAMETROS");
  }


  // public void acelera() {
  //   velocidadActual += 15;
  // }
  // public void decelerar() {}

  
}