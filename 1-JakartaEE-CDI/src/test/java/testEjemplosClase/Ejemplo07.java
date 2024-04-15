package testEjemplosClase;

import org.jboss.weld.junit5.auto.AddPackages;
import org.jboss.weld.junit5.auto.EnableAutoWeld;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import ejemplosClase.ejemplo07.aplicacion.ClienteService;
import ejemplosClase.ejemplo07.aplicacion.impl.ClienteServiceImpl;
import ejemplosClase.ejemplo07.dominio.Cliente;
import ejemplosClase.ejemplo07.infraestructura.persistencia.JpaClienteRepositorio;
import jakarta.inject.Inject;

@EnableAutoWeld
@AddPackages(ClienteServiceImpl.class)
@AddPackages(JpaClienteRepositorio.class)
class Ejemplo07 {

	@Inject
	private ClienteService clienteService;
	
	//Este test estaría representando la capa de Interfaces
	@Test
	@DisplayName("Recuperar clientes")
	void test() {
		for(Cliente cli: clienteService.obtenerClientes()) {
			System.out.println(cli.toString());
		}
		
		clienteService.agregarCliente("Pepe");
		
		for(Cliente cli: clienteService.obtenerClientes()) {
			System.out.println(cli.toString());
		}
	}
	
	

}
