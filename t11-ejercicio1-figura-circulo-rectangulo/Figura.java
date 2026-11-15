public abstract class Figura {
    public abstract double calcularArea();

    // Metodo concreto que usa el metodo abstracto (plantilla)
    public void mostrarArea() {
        System.out.printf("El area de %s es: %.2f%n", getClass().getSimpleName(), calcularArea());
    }
}
