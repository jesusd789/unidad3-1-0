/*
 * CASO ERROR 5 - Herencia multiple de CLASES (no permitida en Java).
 * Para ver el error: quita el prefijo "//ERROR>> " de la linea marcada y compila.
 * Solucion: heredar de una sola clase y usar interfaces para los demas comportamientos.
 */
public class Error5_ExtenderDosClases {
    public static void demostrar() {
        System.out.println("[Error5] extends de dos clases");
        new HibridoOkE5().caminar();
        new HibridoOkE5().nadar();
    }
}

class TerrestreE5 { public void caminar() { System.out.println("  Correcto: camina (clase base)."); } }
class AcuaticoE5  { public void nadar()   { System.out.println("  Correcto: nada (via interfaz)."); } }

//ERROR>> class HibridoIncorrectoE5 extends TerrestreE5, AcuaticoE5 { }

interface NadadorE5 { void nadar(); }

class HibridoOkE5 extends TerrestreE5 implements NadadorE5 {
    @Override
    public void nadar() { System.out.println("  Correcto: nada (via interfaz)."); }
}
