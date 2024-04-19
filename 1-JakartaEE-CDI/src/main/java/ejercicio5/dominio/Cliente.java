package ejercicio5.dominio;

public class Cliente {
	private int id;
	private String nombre;
	
	public Cliente(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public String toString() {
		return "Cliente [Nombre: " + nombre + "]";
	}
	
	
	//otros atributos y lógica de negocio
	
}
