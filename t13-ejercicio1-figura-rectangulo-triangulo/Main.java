public class Main {
    public static void main(String[] args) {
        System.out.println("=== Taller 13 - Ejercicio 1: Figura, Rectangulo y Triangulo ===");
        Figura rectangulo = new Rectangulo(5, 3);
        Figura triangulo = new Triangulo(6, 4);
        System.out.println("Area del rectangulo: " + rectangulo.calcularArea());
        System.out.println("Area del triangulo: " + triangulo.calcularArea());
    }
}
