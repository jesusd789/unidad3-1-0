// Clase derivada: extiende Animal y esta obligada a implementar hacerSonido()
public class Perro extends Animal {

    public Perro(String nombre) {
        super(nombre); // llama al constructor de la clase abstracta
    }

    @Override
    public void hacerSonido() {
        System.out.println("El perro ladra.");
    }
}
