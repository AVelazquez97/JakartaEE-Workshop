package ejercicio2;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.enterprise.event.Event;
import jakarta.inject.Inject;

@ApplicationScoped
public class PublicadorEventoAdicional {

	@Inject
	private Event<EventoAdicional> eventoConcretoAdicional;

	public void publicarEventoAdicional(String descEvento) {
		EventoAdicional e = new EventoAdicional(descEvento);
		eventoConcretoAdicional.fire(e);

		System.out.println("Notificando evento adicional: " + descEvento);
	}
}
