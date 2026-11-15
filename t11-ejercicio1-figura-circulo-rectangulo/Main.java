public class Main {
    public static void main(String[] args) {
        System.out.println("=== Taller 11 - Ejercicio 1: Figura, Circulo y Rectangulo ===");
        Figura circulo = new Circulo(5);
        Figura rectangulo = new Rectangulo(4, 6);
        circulo.mostrarArea();
        rectangulo.mostrarArea();
    }
}
