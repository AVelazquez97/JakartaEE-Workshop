package ejercicio5.infraestructura.persistencia;

import ejercicio5.dominio.Empleado;
import ejercicio5.dominio.EmpleadoRepositorio;
import jakarta.annotation.PostConstruct;
import jakarta.enterprise.context.ApplicationScoped;

import java.util.ArrayList;
import java.util.List;

@ApplicationScoped
public class JpaEmpleadoRepositorio implements EmpleadoRepositorio {

	private List<Empleado> empleados;
	
	@PostConstruct
	private void poblarEmpleados() {
		empleados = new ArrayList<Empleado>();
		empleados.add(new Empleado("Roberto", "Desarrollador"));
		empleados.add(new Empleado("Pepe", "Analista de Marketing"));
		empleados.add(new Empleado("Fabián", "Analista de Infraestructura"));
	}

	@Override
	public List<Empleado> findAll() {
		return empleados;
	}

	@Override
	public void insertarEmpleado(Empleado nuevoEmpleado) {
		empleados.add(nuevoEmpleado);
	}
}
