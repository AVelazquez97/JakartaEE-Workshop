package ejercicio5.aplicacion.impl;

import ejercicio5.aplicacion.ClienteService;
import ejercicio5.dominio.Cliente;
import ejercicio5.dominio.ClienteRepositorio;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

import java.util.List;

@ApplicationScoped
public class ClienteServiceImpl implements ClienteService {
	@Inject
	private ClienteRepositorio clienteRepositorio;
	
	@Override
	public void agregarCliente(String nombre) {
		System.out.println("Agregando cliente: " + nombre);
		
		//Necesito hacer new de objetos nuevos
		Cliente clienteNuevo = new Cliente(nombre);
		clienteRepositorio.agregar(clienteNuevo);
	}

	@Override
	public void borrarCliente(int idi) {
		// TODO Auto-generated method stub
	}

	@Override
	public List<Cliente> obtenerClientes() {
		System.out.println("Recuperando todos los clientes...");
		
		return clienteRepositorio.findAll();
	}

}
