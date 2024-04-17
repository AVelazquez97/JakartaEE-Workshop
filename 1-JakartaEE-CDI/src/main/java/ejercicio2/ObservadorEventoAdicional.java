package ejercicio2;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.enterprise.event.Observes;

@ApplicationScoped
public class ObservadorEventoAdicional {
    public void accept(@Observes EventoAdicional e){
        System.out.println("Soy el observador de un Evento Adicional: He recibido un evento: " + e.getDescripcion());
    }
}
