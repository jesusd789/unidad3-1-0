/*
 * CASO ERROR 3 - Un metodo abstracto NO puede tener cuerpo.
 * Para ver el error: quita el prefijo "//ERROR>> " de las lineas marcadas y compila.
 */
public class Error3_MetodoAbstractoConCuerpo {
    public static void demostrar() {
        System.out.println("[Error3] Metodo abstracto con cuerpo");
        new ConcretaE3().saludar();
    }
}

abstract class BaseIncorrectaE3 {
    //ERROR>> public abstract void saludar() { System.out.println("hola"); }
}

abstract class BaseE3 {
    public abstract void saludar(); // forma correcta: sin cuerpo
}

class ConcretaE3 extends BaseE3 {
    @Override
    public void saludar() { System.out.println("  Correcto: el cuerpo se escribe en la subclase."); }
}
