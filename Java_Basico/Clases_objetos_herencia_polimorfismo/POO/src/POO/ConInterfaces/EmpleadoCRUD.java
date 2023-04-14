package POO.ConInterfaces;

import POO.SinInterfaces.Empleado;

import java.util.List;

/**
 * Se declaran los metodos, no se implementan
 *
 * Actua como un contrato, dice lo que hay que hacer pero no lo hace
 *
 */
public interface EmpleadoCRUD {

    void guardar(Empleado empleado);

    List<Empleado> findAllI();

    void delete(Empleado empleado);
}
