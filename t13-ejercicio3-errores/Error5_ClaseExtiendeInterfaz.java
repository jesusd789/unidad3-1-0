/*
 * CASO ERROR 5 - Usar 'extends' con una interfaz desde una clase (debe ser 'implements').
 * Para ver el error: quita el prefijo "//ERROR>> " de las lineas marcadas y compila.
 */
public class Error5_ClaseExtiendeInterfaz {
    public static void demostrar() {
        System.out.println("[Error5] class extends Interfaz");
        new PatoOkE5().nadar();
    }
}

interface NadadorE5 { void nadar(); }

//ERROR>> class PatoIncorrectoE5 extends NadadorE5 {
//ERROR>>     public void nadar() { }
//ERROR>> }

class PatoOkE5 implements NadadorE5 {
    @Override
    public void nadar() { System.out.println("  Correcto: la clase usa 'implements' con interfaces."); }
}
