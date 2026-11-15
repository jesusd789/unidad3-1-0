/*
 * CASO ERROR 3 - Metodo con cuerpo en una interfaz sin 'default' ni 'static'.
 * Para ver el error: quita el prefijo "//ERROR>> " de las lineas marcadas y compila.
 */
public class Error3_MetodoConCuerpoEnInterfaz {
    public static void demostrar() {
        System.out.println("[Error3] Metodo con cuerpo en interfaz sin default");
        new ImplOkE3().saludar();
    }
}

interface SaludoIncorrectoE3 {
    //ERROR>> void saludar() { System.out.println("hola"); }
}

interface SaludoOkE3 {
    default void saludar() { System.out.println("  Correcto: con 'default' si se permite cuerpo."); }
}

class ImplOkE3 implements SaludoOkE3 { }
