
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
   Para todos los casos implemente el test correspondiente. 

- - -

Los ejemplos de los que se habla en la consigna se encuentran en la ruta: `src/main/java/ejemplosClase`

Y sus correspondientes tests en esta otra ruta: `src/test/java/testEjemplosClase`
- - -

### Resolución de los ejercicios:

1) Se puede ver la solución del ejercicio en la siguiente ruta: `src/main/java/ejemplo6Extendido`.
2) Esta solución está en la misma ruta que el anterior.
3) S
4) Significa que el contenedor de Weld ha sido levantado y al finalizar el ciclo de vida de la aplicación, se destruyó.
5) Solución del ejercicio en la ruta: `src/main/java/ejemplo7Extendido`
