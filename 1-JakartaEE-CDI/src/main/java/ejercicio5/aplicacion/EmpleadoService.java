package ejercicio5.aplicacion;

import ejercicio5.dominio.Empleado;

import java.util.List;

public interface EmpleadoService {
	void agregarEmpleado(String nombreEmpleado, String cargoEmpleado);
	void borrarEmpleado(int idEmpleado);
	List<Empleado> obtenerEmpleados();
}
