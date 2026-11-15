/*
 * CASO ERROR 4 - Una interfaz no puede tener constructor (no se instancia ni tiene estado propio).
 * Para ver el error: quita el prefijo "//ERROR>> " de las lineas marcadas y compila.
 */
public class Error4_InterfazConConstructor {
    public static void demostrar() {
        System.out.println("[Error4] Constructor dentro de una interfaz");
        new ConEstadoE4("  Correcto: el constructor va en una clase abstracta.").mostrar();
    }
}

interface ConfigIncorrectaE4 {
    //ERROR>> ConfigIncorrectaE4() { }
}

abstract class BaseE4 {
    protected String texto;
    public BaseE4(String texto) { this.texto = texto; }
    public void mostrar() { System.out.println(texto); }
}

class ConEstadoE4 extends BaseE4 {
    public ConEstadoE4(String texto) { super(texto); }
}
