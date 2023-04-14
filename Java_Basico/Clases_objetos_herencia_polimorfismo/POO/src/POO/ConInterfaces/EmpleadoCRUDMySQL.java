package POO.ConInterfaces;

import POO.SinInterfaces.Empleado;

import java.util.List;

public class EmpleadoCRUDMySQL implements  EmpleadoCRUD{

    @Override
    public void guardar(Empleado empleado) {

    }

    @Override
    public List<Empleado> findAllI() {
        return null;
    }

    @Override
    public void delete(Empleado empleado) {

    }
}
