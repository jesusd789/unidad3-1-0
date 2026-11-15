public class Main {
    public static void main(String[] args) {
        System.out.println("=== Taller 11 - Ejemplo 3: Polimorfismo con clase abstracta ===");

        // Un arreglo del tipo abstracto guarda objetos de distintas subclases
        Animal[] granja = { new Perro("Firulais"), new Gato("Michi"), new Vaca("Lola") };

        for (Animal a : granja) {
            a.presentarse(); // cada objeto ejecuta SU hacerSonido()
        }
    }
}
