# POO - Unidad 3: Actividad Individual (Talleres 11, 12 y 13)

- **Asignatura:** Programacion Orientada a Objetos
- **Programa:** Ingenieria de Software - Universidad de Cartagena
- **Tutor:** John Carlos Arrieta Arrieta
- **Estudiante:** Jesus Daniel Gazabon Beltran

## Contenido

| Taller | Tema | Carpetas |
|--------|------|----------|
| 11 | Clases abstractas en Java | `t11-*` |
| 12 | Herencia multiple en Java (uso de interfaces) | `t12-*` |
| 13 | Interfaces vs clases abstractas | `t13-*` |

Cada carpeta es un proyecto independiente con su clase `Main` que demuestra el ejemplo o ejercicio.
Convencion de nombres: `tN-ejemploK-*` (ejemplos del taller), `tN-ejemplo-incorrecto-sin-error` (malas practicas que compilan),
`tN-ejercicioK-*` (ejercicios propuestos) y `tN-ejercicio3-errores` (casos que no compilan, con su explicacion).

## Como ejecutar un ejemplo

```bash
cd t11-ejemplo1-animal-perro
javac *.java
java Main
```

## Flujo de trabajo con Git

Cada ejemplo/ejercicio se desarrollo en su propia rama (`rama-tN-...`), con commits por archivo
(`feat(tN-...): ...`), se publico con `git push origin <rama>` y se integro en `main` con `git merge`.
