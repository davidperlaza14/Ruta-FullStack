package POO.SinInterfaces;
import java.util.List;


public class Main {

    public static void main(String[] args) {

        EmpleadoCRUD empleadoCRUD = new EmpleadoCRUD();

        Empleado juanito = new Empleado("Juanito", 30, 4000,true);
        Empleado roberto = new Empleado("roberto", 30, 4000,true);
        Empleado juan = new Empleado("Juan", 30, 4000,true);


        //guardar empleados
        empleadoCRUD.guardar(juanito);
        empleadoCRUD.guardar(roberto);
        empleadoCRUD.guardar(juan);


        //consultar empleados
        List<Empleado> empleados = empleadoCRUD.findAll();
        System.out.println(empleados);
    }
}
