public interface Vehiculo {
    void acelerar(); // abstracto: obligatorio implementarlo

    // default: implementacion por defecto, la clase puede usarla o sobrescribirla
    default void encender() {
        System.out.println("El vehiculo esta encendido.");
    }

    // static: pertenece a la interfaz, se invoca Vehiculo.info(); NO se hereda ni se sobrescribe
    static void info() {
        System.out.println("Interfaz Vehiculo: define acelerar() y encender().");
    }
}
