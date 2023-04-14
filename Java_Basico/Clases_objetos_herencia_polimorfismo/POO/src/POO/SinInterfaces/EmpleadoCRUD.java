package POO.SinInterfaces;

import java.util.ArrayList;
import java.util.List;

public class EmpleadoCRUD {

//    estrctura de datos
    private List<Empleado> empleados = new ArrayList<>();

//    CREATE - guardar un empleado
    public  void guardar(Empleado empleado) {empleados.add(empleado);}

    public  List<Empleado> findAll() {
        return empleados;
    }
}
