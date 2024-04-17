package ejercicio2;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.enterprise.event.Observes;

@ApplicationScoped
public class ObservadorEventoA {
	public void accept(@Observes Evento e) {
		System.out.println("Soy A: He recibido un evento: " + e.getDescripcion());
	}
}
