/*
 * CASO ERROR 6 - Usar 'implements' con una clase (debe ser 'extends').
 * Para ver el error: quita el prefijo "//ERROR>> " de las lineas marcadas y compila.
 */
public class Error6_ClaseImplementaClase {
    public static void demostrar() {
        System.out.println("[Error6] class implements Clase");
        new PerroOkE6().ladrar();
    }
}

abstract class AnimalE6 { public abstract void ladrar(); }

//ERROR>> class PerroIncorrectoE6 implements AnimalE6 {
//ERROR>>     public void ladrar() { }
//ERROR>> }

class PerroOkE6 extends AnimalE6 {
    @Override
    public void ladrar() { System.out.println("  Correcto: una clase usa 'extends' con otra clase."); }
}
