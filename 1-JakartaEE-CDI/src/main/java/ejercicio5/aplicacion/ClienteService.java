package ejercicio5.aplicacion;

import ejercicio5.dominio.Cliente;

import java.util.List;

public interface ClienteService {
	//Representan los casos de usos de mi aplicación
	public void agregarCliente(String nombre);
	public void borrarCliente(int id);
	public List<Cliente> obtenerClientes();

}
