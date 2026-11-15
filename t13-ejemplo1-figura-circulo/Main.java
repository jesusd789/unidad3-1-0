public class Main {
    public static void main(String[] args) {
        System.out.println("=== Taller 13 - Ejemplo 1: Clase abstracta como base comun ===");
        Figura circulo = new Circulo(3);
        circulo.mostrarFigura();
        System.out.printf("Area del circulo: %.2f%n", circulo.calcularArea());
    }
}
