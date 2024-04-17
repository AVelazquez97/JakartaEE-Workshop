package ejercicio5.infraestructura.persistencia;

import ejercicio5.dominio.Cliente;
import ejercicio5.dominio.ClienteRepositorio;
import jakarta.annotation.PostConstruct;
import jakarta.enterprise.context.ApplicationScoped;

import java.util.ArrayList;
import java.util.List;

@ApplicationScoped
public class JpaClienteRepositorio implements ClienteRepositorio {

	//en la vida real esto será JPA
	private List<Cliente> clientes;
	
	@PostConstruct
	private void poblarClientes() {
		clientes = new ArrayList<Cliente>();
		clientes.add(new Cliente("Juan"));
		clientes.add(new Cliente("Pedro"));
		clientes.add(new Cliente("Raquel"));
	}
	
	@Override
	public List<Cliente> findAll() {
		return clientes;
	}

	@Override
	public void agregar(Cliente cliente) {
		clientes.add(cliente);
	}

}
