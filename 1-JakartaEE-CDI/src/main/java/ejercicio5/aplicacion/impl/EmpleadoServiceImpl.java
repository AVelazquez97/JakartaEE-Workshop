package ejercicio5.aplicacion.impl;

import ejercicio5.aplicacion.EmpleadoService;
import ejercicio5.dominio.Empleado;
import ejercicio5.dominio.EmpleadoRepositorio;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

import java.util.List;

@ApplicationScoped
public class EmpleadoServiceImpl implements EmpleadoService {
    @Inject
    private EmpleadoRepositorio empleadoRespositorio;

    @Override
    public void agregarEmpleado(String nombreEmpleado, String cargoEmpleado) {
        System.out.println("Agregando empleado: " + nombreEmpleado);

        empleadoRespositorio.insertarEmpleado(new Empleado(nombreEmpleado, cargoEmpleado));
    }

    @Override
    public void borrarEmpleado(int idEmpleado) {
        // TODO: Sin implementar
    }

    @Override
    public List<Empleado> obtenerEmpleados() {
        System.out.println("Recuperando todos los empleados...");
        return empleadoRespositorio.findAll();
    }
}
