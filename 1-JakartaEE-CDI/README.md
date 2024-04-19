
# Jakarta CDI 2.0

### Objetivo:

**Practicar uso de Jakarta CDI.**

1) Extienda el ejemplo 06 para que un nuevo tipo de Observador responda a los eventos enviados.
2) Extienda el ejemplo 06 para que el Notificador lance otro tipo diferente de evento. Implemente también el correspondiente Observador.
3) Mediante el uso de un Decorator, extienda el funcionamiento de un Managed Bean.
4) Cuando lanzamos un test unitario, por la consola vemos la siguiente salida.
   ¿Qué significan las mismas?
   ```
   mar 21, 2024 10:41:08 P. M. org.jboss.weld.bootstrap.WeldStartup startContainer
   mar 21, 2024 10:41:09 P. M. org.jboss.weld.environment.se.WeldContainer shutdown
   ```
5) Utilizando las ideas planteadas en el ejemplo 07; agregue a la estructura un
   nuevo servicio en la capa de Aplicación, con su correspondiente objeto de negocio y
   repositorio.

**Para todos los casos implemente el test correspondiente.**

- - -
### Aclaración:

Los ejemplos de los que se habla en la consigna se encuentran en la ruta: `src/main/java/ejemplosClase`

Y sus correspondientes tests en esta otra ruta: `src/test/java/testEjemplosClase`
- - -

### Resolución de los ejercicios:

1) Se agrega la clase **ObservadorC** como **Managed Bean.** 
   - Solución del ejercicio en la siguiente ruta: `src/main/java/ejercicio1`.
   - Test: `src/test/java/testEjercicios/Ejercicio1`.
2) Se agregan las clases **EventoAdicional**, **ObservadorEventoAdicional** y **PublicadorEventoAdicional**, estas 
 dos últimas como **Managed Beans.** 
   - Solución del ejercicio en la siguiente ruta: `src/main/java/ejercicio2`.
   - Test: `src/test/java/testEjercicios/Ejercicio2`.
3) Se reutilizan las clases Evento, ObservadorEvento y PublicadorEvento. A esto se le agrega una Interafaz que ofrece 
 las operaciones que implementa el Publicador, y también un decorador que decora al publicador.
   - Solución del ejercicio en la siguiente ruta: `src/main/java/ejercicio3`.
   - Test: `src/test/java/testEjercicios/Ejercicio3`.
4) Significa que el contenedor de Weld ha sido levantado y al finalizar el ciclo de vida de la aplicación, se destruyó.
5) Se agrega el servicio necesario para gestionar empleados. Adicionalmente, se agrega su correspondiente objeto de 
 negocio y repositorio.
   - Solución del ejercicio en la ruta: `src/main/java/ejercicio5`
   - Test: `src/test/java/testEjercicios/Ejercicio5`.

