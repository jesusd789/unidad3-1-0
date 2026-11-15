/*
 * CASO ERROR 1 - Intentar instanciar una clase abstracta.
 * Para ver el error: quita el prefijo "//ERROR>> " de la linea marcada y compila.
 */
public class Error1_InstanciarAbstracta {
    public static void demostrar() {
        System.out.println("[Error1] Instanciar una clase abstracta");
        //ERROR>> FiguraE1 figura = new FiguraE1();
        FiguraE1 correcta = new CirculoE1(); // forma correcta: instanciar la subclase concreta
        System.out.println("  Correcto: se instancia " + correcta.getClass().getSimpleName() + ", no la abstracta.");
    }
}

abstract class FiguraE1 {
    public abstract double calcularArea();
}

class CirculoE1 extends FiguraE1 {
    @Override
    public double calcularArea() { return 0; }
}
