# Taller 13 - Ejercicio 3: Uso incorrecto de clases abstractas e interfaces

Cada archivo `ErrorN_*.java` contiene el codigo incorrecto marcado con `//ERROR>> ` (comentado para que el proyecto compile)
y la forma correcta. Para reproducir el error: quita el prefijo `//ERROR>> ` de las lineas marcadas y compila.

| Caso | Que se hace mal | Mensaje real del compilador (javac 21) |
|------|-----------------|-----------------------------------------|
| Error1_ClaseConcretaNoImplementaInterfaz | Ejercicio 3.1: clase concreta sin implementar la interfaz | `FutbolistaIncorrectoE1 is not abstract and does not override abstract method jugar() in JugadorE1` |
| Error2_DefaultEnClaseAbstracta | Ejercicio 3.2: `default` dentro de una clase abstracta | `modifier default not allowed here` |
| Error3_MetodoConCuerpoEnInterfaz | Metodo con cuerpo en interfaz sin `default`/`static` | `interface abstract methods cannot have body` |
| Error4_InterfazConConstructor | Constructor dentro de una interfaz | `<identifier> expected` |
| Error5_ClaseExtiendeInterfaz | `class X extends UnaInterfaz` | `no interface expected here` |
| Error6_ClaseImplementaClase | `class X implements UnaClase` | `interface expected here` |

## Por que `default` no es posible en una clase abstracta (Ejercicio 3.2)
`default` existio para poder agregar metodos a una interfaz sin romper a las clases que ya la implementaban.
Una clase abstracta ya puede tener metodos concretos normales, asi que `default` no aporta nada en una clase y Java no lo permite.
