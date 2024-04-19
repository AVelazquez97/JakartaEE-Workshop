package testEjercicios;

import ejercicio5.aplicacion.ClienteService;
import ejercicio5.aplicacion.EmpleadoService;
import ejercicio5.aplicacion.impl.ClienteServiceImpl;
import ejercicio5.aplicacion.impl.EmpleadoServiceImpl;
import ejercicio5.dominio.Cliente;
import ejercicio5.dominio.Empleado;
import ejercicio5.infraestructura.persistencia.JpaClienteRepositorio;
import ejercicio5.infraestructura.persistencia.JpaEmpleadoRepositorio;
import jakarta.inject.Inject;
import org.jboss.weld.junit5.auto.AddPackages;
import org.jboss.weld.junit5.auto.EnableAutoWeld;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@EnableAutoWeld
@AddPackages(ClienteServiceImpl.class)
@AddPackages(JpaClienteRepositorio.class)
@AddPackages(EmpleadoServiceImpl.class)
@AddPackages(JpaEmpleadoRepositorio.class)
class Ejercicio5 {

	@Inject
	private ClienteService clienteService;

	@Inject
	private EmpleadoService empleadoService;
	
	// Test correspondiente a los servicios del empleado
	@Test
	@DisplayName("Recuperar clientes")
	void testCliente() {
		System.out.println("=========================================");
		for(Cliente cli: clienteService.obtenerClientes()) {
			System.out.println(cli.toString());
		}
		System.out.println("=========================================");
		clienteService.agregarCliente("Pepe");
		System.out.println("=========================================");
		for(Cliente cli: clienteService.obtenerClientes()) {
			System.out.println(cli.toString());
		}
		System.out.println("=========================================");
	}

	@Test
	@DisplayName("Recuperar empleados")
	void testEmpleado() {
		System.out.println("=========================================");
		for(Empleado e: empleadoService.obtenerEmpleados()) {
			System.out.println(e.toString());
		}
		System.out.println("=========================================");
		empleadoService.agregarEmpleado("Alexis", "Backend Dev");
		System.out.println("=========================================");
		for(Empleado e: empleadoService.obtenerEmpleados()) {
			System.out.println(e.toString());
		}
		System.out.println("=========================================");
	}

}
