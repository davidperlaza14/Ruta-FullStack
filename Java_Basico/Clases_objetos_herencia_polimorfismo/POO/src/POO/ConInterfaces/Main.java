package POO.ConInterfaces;

import POO.SinInterfaces.Empleado;

public class Main {

    static EmpleadoCRUD empleadoCRUD;

    public static void main(String[] args) {

        empleadoCRUD.findAllI();
        empleadoCRUD.guardar(new Empleado());
    }
}
