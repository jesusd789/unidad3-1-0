// Interfaz: capacidad "puede trabajar", con un default
public interface Trabajador {
    void trabajar();

    default void tomarDescanso() { System.out.println("Tomando un descanso."); }
}
