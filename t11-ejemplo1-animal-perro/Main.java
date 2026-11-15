public class Main {
    public static void main(String[] args) {
        System.out.println("=== Taller 11 - Ejemplo 1: Animal (abstracta) y Perro ===");

        // Animal a = new Animal("x"); // ERROR: Animal es abstracta y no se puede instanciar

        Perro perro = new Perro("Firulais");
        perro.mostrarNombre(); // metodo concreto heredado
        perro.hacerSonido();   // metodo abstracto implementado en Perro

        // Una variable del tipo abstracto puede referenciar un objeto de la subclase
        Animal animal = new Perro("Rex");
        animal.mostrarNombre();
        animal.hacerSonido();
    }
}
