package ejercicio5.dominio;

public class Empleado {
    private int id;
    private String nombre;
    private String cargo;

    public Empleado (String nombre, String cargo) {
        this.nombre = nombre;
        this.cargo = cargo;
    }

    @Override
    public String toString() {
        return "Empleado [Nombre: " + nombre + " / Cargo: " + cargo + "]";
    }
}