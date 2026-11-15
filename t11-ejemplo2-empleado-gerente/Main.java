public class Main {
    public static void main(String[] args) {
        System.out.println("=== Taller 11 - Ejemplo 2: Empleado (abstracta) y Gerente ===");
        Gerente gerente = new Gerente("Laura Perez", 1500000);
        gerente.mostrarNombre();
        gerente.calcularSalario();
    }
}
