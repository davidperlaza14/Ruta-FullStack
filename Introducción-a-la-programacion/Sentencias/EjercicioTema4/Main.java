package Sentencias.EjercicioTema4;

// Enunciado del ejercicio:

// En este ejercicio practicarás las estructuras de control, para ello deberás crear:

// Usando un if, crear una condición que compare si la variable numeroIf es positivo, negativo, o 0.
// Pista: Los números inferiores a 0 son negativos y los superiores, positivos.

// Crea un bucle While, este bucle tendrá que tener como condición que la variable numeroWhile sea inferior a 3, el bloque de código que tendrá el bucle deberá:

// Incrementar el valor de la variable en uno cada vez que se ejecute.

// Mostrarlo por pantalla cada vez que se ejecute.

// Para el bucle Do While, deberás crear la misma estructura que en el While, pero solo se debe ejecutar una vez.

// Para el bucle For, crea una variable numeroFor, esta variable tendrá como valor 0 y su condición será que la variable sea igual o menor que 3, se irá incrementando en 1 su valor cada vez que se ejecute y deberá mostrarse por pantalla.

// Por último, para el Switch, deberás crear la variable estacion, y distintos case para las cuatro estaciones del año. Dependiendo del valor de la variable estacion se deberá mandar un mensaje por consola informando de la estación en la que está. También habrá que poner un default para cuando el valor de la variable no sea una estación.

public class Main {
  
  public static void main(String[] args) {

    // if, else, else if
    int numeroIf = -1;

    if (numeroIf > 0){
      System.out.println("La variable numeroIf   " + numeroIf  +    "  es positivo");
    }else if (numeroIf == 0){
      System.out.println("La variable numeroIf " + numeroIf +  " es cero");
    }else {
      System.out.println(" La variable numeroIf "  + numeroIf  +  "  es negativo  ");
    }

    // while 
    int numeroWhile = 1;

    while (numeroWhile < 3) {
      numeroWhile ++;
      System.out.println("La variable numeroWhile ahora vale:" + numeroWhile );
      
    }

    // do while 
    int numeroDoWhile = 3;

    do {
      numeroDoWhile ++;
      System.out.println("La variable numeroDoWhile  vale: " + numeroDoWhile);
    } while (numeroDoWhile < 3);

    for(int numeroFor = 0;  numeroFor <= 3; numeroFor++ ) {
      System.out.println("La variable numeroFor vale: " + numeroFor);
    }
    //switch
    String estacion = "invierno";
    switch(estacion) {
        case "verano":
            System.out.println("Estamos en verano");
            break;
        case "invierno":
            System.out.println("Estamos en invierno");
            break;
        case "primavera":
            System.out.println("Estamos en primavera");
            break;
        case "otoño":
            System.out.println("Estamos en otoño");
            break;
        default:
            System.out.println("No es una estación");
    }

  }
}
