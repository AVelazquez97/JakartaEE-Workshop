package ejercicio3;

import jakarta.annotation.Priority;
import jakarta.decorator.Decorator;
import jakarta.decorator.Delegate;
import jakarta.inject.Inject;

@Decorator
@Priority(1) //para habilitar el uso del Decorador
public abstract class DecoradorPublicadorEvento implements PublicadorEvento {
    @Inject
    @Delegate
    private PublicadorEvento PublicadorDecorado;

    @Override
    public void publicarEvento(String descEvento) {
            System.out.println("Se pasa por el decorador del publicador");
            // Se invoca al objeto principal
            PublicadorDecorado.publicarEvento(descEvento);
    }
}
