package refactor;

public class ConstructorLargoBuilder {

    String marca;
    String modelo;
    String motor;
    int puertas;


    private ConstructorLargoBuilder() {

    }
    ConstructorLargoBuilder(String marca) {
        this.marca = marca;
    }
    ConstructorLargoBuilder conModelo(String modelo) {
        this.modelo = modelo;
        return this;
    }

    ConstructorLargoBuilder conMotor(String motor) {
        this.motor  = motor;
        return this;
    }

    ConstructorLargoBuilder conPuertas(int puertas) {
        this.puertas  = puertas;
        return this;
    }

}
