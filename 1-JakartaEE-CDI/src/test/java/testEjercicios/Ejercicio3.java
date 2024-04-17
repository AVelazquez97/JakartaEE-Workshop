package testEjercicios;


import ejercicio3.Evento;
import ejercicio3.PublicadorEvento;
import jakarta.inject.Inject;
import org.jboss.weld.junit5.auto.AddPackages;
import org.jboss.weld.junit5.auto.EnableAutoWeld;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@EnableAutoWeld
@AddPackages(Evento.class)
@AddPackages(PublicadorEvento.class)
public class Ejercicio3 {
    @Inject
    private PublicadorEvento publicadorEvento;

    @Test
    @DisplayName("Probando de decorar un objeto que lanza un evento")
    void test() {
        publicadorEvento.publicarEvento("Algo nuevo ha sucedido");
    }
}