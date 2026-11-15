/*
 * CASO ERROR 2 - Dos interfaces con el mismo metodo default (problema del diamante).
 * Para ver el error: quita el prefijo "//ERROR>> " de las lineas marcadas y compila.
 * Solucion: sobrescribir despegar() en la clase y usar Interfaz.super.despegar().
 */
public class Error2_ConflictoMetodosDefault {
    public static void demostrar() {
        System.out.println("[Error2] Conflicto entre metodos default");
        new AnfibioOkE2().despegar();
    }
}

interface VoladorE2 { default void despegar() { System.out.println("Volador despega."); } }
interface NadadorE2 { default void despegar() { System.out.println("Nadador despega."); } }

//ERROR>> class AnfibioIncorrectoE2 implements VoladorE2, NadadorE2 { }

class AnfibioOkE2 implements VoladorE2, NadadorE2 {
    @Override
    public void despegar() {
        System.out.print("  Correcto: ");
        VoladorE2.super.despegar();
    }
}
