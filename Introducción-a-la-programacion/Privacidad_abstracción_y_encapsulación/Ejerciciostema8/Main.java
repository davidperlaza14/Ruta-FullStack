package Privacidad_abstracción_y_encapsulación.Ejerciciostema8;

// Enunciado del ejercicio:

// Para practicar la encapsulación:

// Crear clase Persona.

// Crear variables las privadas edad, nombre y telefono de la clase Persona.

// Crear gets y sets de cada propiedad.

// Crear un objeto persona en el main.

// Utiliza los gets y sets para darle valores a las propiedades edad, nombre y telefono, por último muéstralas por consola.

public class Main {

  public static void main(String[] args) {

      Persona persona = new Persona();
      persona.setNombre("David Stiven");
      System.out.println("Mi nombre es " + persona.getNombre());
      persona.setEdad(24);
      System.out.println("Tengo " + persona.getEdad() + " años");
      persona.setTelefono(316633860);
      System.out.println("Mi teléfono es " + persona.getTelefono());
  }
}

class Persona {
  private String nombre;
  private int edad;
  private int telefono;

  public void setNombre(String nombre) {
      this.nombre = nombre;
  }

  public String getNombre() {
      return nombre;
  }

  public void setEdad(int edad){
      this.edad = edad;
  }

  public int getEdad() {
      return edad;
  }

  public void setTelefono(int telefono){
      this.telefono = telefono;
  }

  public int getTelefono() {
      return telefono;
  }
}
