public class Main {
    public static void main(String[] args) {
        System.out.println("=== Taller 12 - Ejemplo 3: metodos default y static ===");
        Vehiculo.info(); // llamada al metodo estatico por el nombre de la interfaz

        Vehiculo coche = new Coche();
        coche.encender();  // usa el default
        coche.acelerar();

        Vehiculo moto = new Moto();
        moto.encender();   // usa el default sobrescrito
        moto.acelerar();
    }
}
