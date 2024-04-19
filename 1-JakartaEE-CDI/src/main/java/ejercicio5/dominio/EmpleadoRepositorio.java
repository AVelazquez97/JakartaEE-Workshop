package ejercicio5.dominio;

import java.util.List;

public interface EmpleadoRepositorio {
    List<Empleado> findAll();
    void insertarEmpleado(Empleado nuevoEmpleado);
}
