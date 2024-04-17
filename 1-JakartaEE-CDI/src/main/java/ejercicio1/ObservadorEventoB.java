package ejercicio1;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.enterprise.event.Observes;

@ApplicationScoped
public class ObservadorEventoB {
	public void accept(@Observes Evento e) {
		System.out.println("Soy B: He recibido un evento: " + e.getDescripcion());
	}
}
