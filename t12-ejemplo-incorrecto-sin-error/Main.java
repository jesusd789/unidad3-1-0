public class Main {
    public static void main(String[] args) {
        System.out.println("=== Taller 12 - Ejemplos incorrectos SIN error de compilacion ===");
        new Arbol().correr();
        new Casa().moverse();
        System.out.println("Compila y ejecuta, pero el diseno es incorrecto: la interfaz es un CONTRATO");
        System.out.println("de capacidad ('puede hacer'); si la clase no puede cumplirlo, no debe implementarla.");
    }
}
