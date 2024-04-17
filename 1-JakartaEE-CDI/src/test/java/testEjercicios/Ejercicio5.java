package testEjercicios;

import ejercicio5.aplicacion.ClienteService;
import ejercicio5.aplicacion.impl.ClienteServiceImpl;
import ejercicio5.dominio.Cliente;
import ejercicio5.infraestructura.persistencia.JpaClienteRepositorio;
import jakarta.inject.Inject;
import org.jboss.weld.junit5.auto.AddPackages;
import org.jboss.weld.junit5.auto.EnableAutoWeld;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@EnableAutoWeld
@AddPackages(ClienteServiceImpl.class)
@AddPackages(JpaClienteRepositorio.class)
class Ejercicio5 {

	@Inject
	private ClienteService clienteService;
	
	//Este test estaría representando la capa de Interfaces
	@Test
	@DisplayName("Recuperar clientes")
	void test() {
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
	
	

}
