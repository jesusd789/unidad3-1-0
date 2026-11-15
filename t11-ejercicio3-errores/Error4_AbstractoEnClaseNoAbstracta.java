/*
 * CASO ERROR 4 - Declarar un metodo abstracto en una clase que NO es abstracta.
 * Para ver el error: quita el prefijo "//ERROR>> " de las lineas marcadas y compila.
 */
public class Error4_AbstractoEnClaseNoAbstracta {
    public static void demostrar() {
        System.out.println("[Error4] Metodo abstracto dentro de una clase no abstracta");
        new ReporteConcretoE4().generar();
    }
}

//ERROR>> class ReporteE4 {
//ERROR>>     public abstract void generar();
//ERROR>> }

abstract class ReporteOkE4 { // forma correcta: la clase tambien es abstract
    public abstract void generar();
}

class ReporteConcretoE4 extends ReporteOkE4 {
    @Override
    public void generar() { System.out.println("  Correcto: la clase con metodo abstracto es abstract y la subclase lo implementa."); }
}
