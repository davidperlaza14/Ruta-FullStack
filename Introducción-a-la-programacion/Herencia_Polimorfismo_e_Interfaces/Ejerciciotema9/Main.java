package Herencia_Polimorfismo_e_Interfaces.Ejerciciotema9;

// Crea una clase Persona con las siguientes variables:

// La edad

// El nombre

// El teléfono

// Una vez creada la clase, crea una nueva clase Cliente que herede de Persona, esta nueva clase tendrá la variable credito solo para esa clase.

// Crea ahora un objeto de la clase Cliente que debe tener como propiedades la edad, el telefono, el nombre y el credito, tienes que darles valor y mostrarlas por pantalla.

// Una vez hecho esto, haz lo mismo con la clase Trabajador que herede de Persona, y con una variable salario que solo tenga la clase Trabajador.

public class Main {

  public static void main(String[] args) {
      Cliente cliente = new Cliente();
      Trabajador trabajador = new Trabajador();
      cliente.nombre = "David Stiven";
      cliente.edad = 23;
      cliente.telefono = 123456789;
      cliente.credito = 110.55;
      System.out.println("Soy " + cliente.nombre + ", tengo " + cliente.edad + " años y mi telefono es " + cliente.telefono
              + " y mi credito disponible es " + cliente.credito + "$");

      trabajador.nombre = "Ivan";
      trabajador.edad = 24;
      trabajador.telefono = 987654321;
      trabajador.salario = 45000;
      System.out.println("Soy " + trabajador.nombre + ", tengo " + trabajador.edad + " años y mi telefono es " + trabajador.telefono
              + " y mi salario es de " + trabajador.salario + "€");

  }
}

class Persona{
  int edad;
  int telefono;
  String nombre;
}

class Cliente extends Persona{
  double credito;
}

class Trabajador extends Persona {
  double salario;
}