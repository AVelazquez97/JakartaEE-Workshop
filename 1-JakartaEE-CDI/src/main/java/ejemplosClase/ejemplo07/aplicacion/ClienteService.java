package ejemplosClase.ejemplo07.aplicacion;

import java.util.List;

import ejemplosClase.ejemplo07.dominio.Cliente;

public interface ClienteService {
	//Representan los casos de usos de mi aplicación
	public void agregarCliente(String nombre);
	public void borrarCliente(int id);
	public List<Cliente> obtenerClientes();

}
