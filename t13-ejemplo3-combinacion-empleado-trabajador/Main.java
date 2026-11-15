public class Main {
    public static void main(String[] args) {
        System.out.println("=== Taller 13 - Ejemplo 3: Clase abstracta + interfaces combinadas ===");
        Gerente gerente = new Gerente("Laura Perez", 1500000);
        gerente.mostrarNombre();     // de la clase abstracta
        gerente.calcularSalario();   // abstracto implementado
        gerente.trabajar();          // de la interfaz Trabajador
        gerente.tomarDescanso();     // default de la interfaz
        gerente.hablar();            // de la interfaz Hablador

        System.out.println("--- Persona (solo interfaces) ---");
        Persona persona = new Persona();
        persona.trabajar();
        persona.hablar();
    }
}
