package testEjercicios;

import ejercicio1.Evento;
import ejercicio1.PublicadorEvento;
import jakarta.inject.Inject;
import org.jboss.weld.junit5.auto.AddPackages;
import org.jboss.weld.junit5.auto.EnableAutoWeld;
import org.junit.jupiter.api.Test;

@EnableAutoWeld
@AddPackages(Evento.class)
public class Ejercicio1 {
    @Inject
    private PublicadorEvento publicadorEvento;

    @Test
    void test() {
        publicadorEvento.publicarEvento("Algo nuevo ha sucedido");
    }
}