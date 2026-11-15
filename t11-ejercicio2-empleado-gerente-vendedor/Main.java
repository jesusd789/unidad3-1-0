public class Main {
    public static void main(String[] args) {
        System.out.println("=== Taller 11 - Ejercicio 2: Empleado, Gerente y Vendedor ===");
        Empleado gerente = new Gerente("Laura Perez", 5000000, 1500000);
        Empleado vendedor = new Vendedor("Carlos Mora", 1800000, 20000000, 5);
        gerente.mostrarDetalles();
        vendedor.mostrarDetalles();
    }
}
