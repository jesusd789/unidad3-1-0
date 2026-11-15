// Interfaz como CONTRATO: define capacidades, sin estado ni jerarquia
public interface Vehiculo {
    void acelerar();

    default void encender() {
        System.out.println("El vehiculo esta encendido.");
    }
}
