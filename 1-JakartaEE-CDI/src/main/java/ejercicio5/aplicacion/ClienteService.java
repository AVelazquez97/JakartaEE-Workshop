package ejercicio5.aplicacion;

import ejercicio5.dominio.Cliente;

import java.util.List;

public interface ClienteService {
	//Representan los casos de usos de mi aplicación
	void agregarCliente(String nombre);
	void borrarCliente(int id);
	List<Cliente> obtenerClientes();

}
