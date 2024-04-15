package testEjemplosClase;

import ejemplosClase.ejemplo06.Evento;
import ejemplosClase.ejemplo06.PublicadorEvento;
import org.jboss.weld.junit5.auto.AddPackages;
import org.jboss.weld.junit5.auto.EnableAutoWeld;
import org.junit.jupiter.api.Test;

import jakarta.inject.Inject;

@EnableAutoWeld
@AddPackages(Evento.class)
class Ejemplo06 {

	@Inject 
	private PublicadorEvento pulicadorEvento;
	
	@Test
	void test() {
		pulicadorEvento.publicarEvento("Algo nuevo ha sucedido");
	}

}
