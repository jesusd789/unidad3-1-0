public class Main {
    public static void main(String[] args) {
        System.out.println("=== Taller 13 - Ejemplo 2: Interfaz como contrato ===");
        Vehiculo[] vehiculos = { new Coche(), new Bicicleta() };
        for (Vehiculo v : vehiculos) {
            v.encender();
            v.acelerar();
        }
    }
}
