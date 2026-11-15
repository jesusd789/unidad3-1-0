# Taller 12 - Ejercicio 3: Implementacion incorrecta de multiples interfaces

Cada archivo `ErrorN_*.java` contiene el codigo incorrecto marcado con `//ERROR>> ` (comentado para que el proyecto compile)
y la forma correcta. Para reproducir el error: quita el prefijo `//ERROR>> ` de las lineas marcadas y compila.

| Caso | Que se hace mal | Mensaje real del compilador (javac 21) |
|------|-----------------|-----------------------------------------|
| Error1_NoImplementaMetodoInterfaz | Clase concreta que no implementa `jugar()` | `FutbolistaIncorrectoE1 is not abstract and does not override abstract method jugar() in JugadorE1` |
| Error2_ConflictoMetodosDefault | Dos interfaces con el mismo `default despegar()` | `types VoladorE2 and NadadorE2 are incompatible; class AnfibioIncorrectoE2 inherits unrelated defaults for despegar()...` |
| Error3_ReducirVisibilidad | Implementar un metodo de interfaz sin `public` | `saludar() in SaludoIncorrectoE3 cannot implement saludar() in SaludadorE3 ... attempting to assign weaker access privileges; was public` |
| Error4_InstanciarInterfaz | `new VoladorE4()` | `VoladorE4 is abstract; cannot be instantiated` |
| Error5_ExtenderDosClases | `class X extends A, B` (herencia multiple de clases) | `'{' expected` |
| Error6_AtributoDeInterfazEsConstante | Reasignar un atributo de interfaz | `cannot assign a value to static final variable VELOCIDAD_MAX` |

Los casos que **compilan pero son mala practica** (`Arbol implements Corredor`, `Casa implements Movible`) estan en la
carpeta `t12-ejemplo-incorrecto-sin-error`.

**Regla clave:** una clase puede implementar muchas interfaces pero extender una sola clase; debe implementar todos los
metodos abstractos (siempre `public`); si hay conflicto de `default`, se resuelve sobrescribiendo con `Interfaz.super.metodo()`.
