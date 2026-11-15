// Clase abstracta: no se puede instanciar, define la base comun de los animales.
public abstract class Animal {
    protected String nombre;

    // Las clases abstractas SI pueden tener constructor (lo usan las subclases con super)
    public Animal(String nombre) {
        this.nombre = nombre;
    }

    // Metodo abstracto: sin cuerpo, cada subclase DEBE implementarlo
    public abstract void hacerSonido();

    // Metodo concreto: implementacion compartida por todas las subclases
    public void mostrarNombre() {
        System.out.println("Nombre: " + nombre);
    }
}
