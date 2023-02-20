package Sentencias;

public class MainSitch {
  public static void main(String[] args) {
    // var estacion = "VERANO";

    // switch (estacion) {
    //   case "VERANO":
    //     System.out.println("Es verano");       
    //     // break;
    //   case "INVIERNO":
    //     System.out.println("Es invierno");       
    //     break;
    
    //   default:
    //     System.out.println("Estoy default");
    // }

    var hoy_es = "DOMINGO";

    switch (hoy_es) {
      case "LUNES":
        // System.out.println("LUNES");
      case "MARTES":
        // System.out.println("MARTES");// break;
      case "MIERCOLES":
        // System.out.println("MIERCOLES");
      case "JUEVES":
        // System.out.println("JUEVES");
      case "VIERNES":
        System.out.println("Hoy es  laborable");
        break;
      case "SABADO":
      case "DOMINGO":
        System.out.println("No es  laborable");
    }
  }
}
