package testEjercicios;

import ejercicio2.Evento;
import ejercicio2.EventoAdicional;
import ejercicio2.PublicadorEvento;
import ejercicio2.PublicadorEventoAdicional;
import jakarta.inject.Inject;
import org.jboss.weld.junit5.auto.AddPackages;
import org.jboss.weld.junit5.auto.EnableAutoWeld;
import org.junit.jupiter.api.Test;

@EnableAutoWeld
@AddPackages(Evento.class)
@AddPackages(EventoAdicional.class)
public class Ejercicio2 {
    @Inject
    private PublicadorEvento publicadorEvento;
    @Inject
    private PublicadorEventoAdicional publicadorEventoAdicional;

    @Test
    void test() {
        publicadorEvento.publicarEvento("Algo nuevo ha sucedido");
        publicadorEventoAdicional.publicarEventoAdicional("Algo adicional ha sucedido.");
    }
}