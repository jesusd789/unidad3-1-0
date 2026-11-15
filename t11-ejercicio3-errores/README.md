# Taller 11 - Ejercicio 3: Uso incorrecto de clases abstractas

Cada archivo `ErrorN_*.java` contiene el codigo incorrecto marcado con `//ERROR>> ` (comentado para que el proyecto compile)
y, justo al lado, la forma correcta. Para reproducir el error: quita el prefijo `//ERROR>> ` de las lineas marcadas y compila.

| Caso | Que se hace mal | Mensaje real del compilador (javac 21) |
|------|-----------------|-----------------------------------------|
| Error1_InstanciarAbstracta | `new FiguraE1()` sobre una clase abstracta | `FiguraE1 is abstract; cannot be instantiated` |
| Error2_NoImplementaMetodoAbstracto | Subclase concreta sin implementar `conducir()` | `CocheIncorrectoE2 is not abstract and does not override abstract method conducir() in VehiculoE2` |
| Error3_MetodoAbstractoConCuerpo | `abstract void saludar() { ... }` | `abstract methods cannot have a body` |
| Error4_AbstractoEnClaseNoAbstracta | Metodo `abstract` en una clase sin `abstract` | `ReporteE4 is not abstract and does not override abstract method generar() in ReporteE4` |
| Error5_AbstractoPrivadoOFinal | `private abstract void operar();` | `illegal combination of modifiers: abstract and private` |
| Error6_MetodoConcretoQueDebeSobrescribirse | **Compila** pero es mala practica (Ejercicio 3.2) | Sin error de compilacion: falla en ejecucion con `UnsupportedOperationException` |

**Regla clave:** una clase abstracta no se instancia; toda subclase concreta debe implementar todos los metodos abstractos;
un metodo abstracto no tiene cuerpo y no puede ser `private`, `final` ni `static` porque debe poder sobrescribirse.
