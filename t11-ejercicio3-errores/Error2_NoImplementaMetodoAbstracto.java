/*
 * CASO ERROR 2 - La clase derivada no implementa el metodo abstracto.
 * Para ver el error: quita el prefijo "//ERROR>> " de las lineas marcadas y compila.
 */
public class Error2_NoImplementaMetodoAbstracto {
    public static void demostrar() {
        System.out.println("[Error2] Subclase concreta que no implementa el metodo abstracto");
        VehiculoE2 coche = new CocheCorrectoE2();
        coche.conducir();
    }
}

abstract class VehiculoE2 {
    public abstract void conducir();
}

//ERROR>> class CocheIncorrectoE2 extends VehiculoE2 {
//ERROR>>     // falta implementar conducir()
//ERROR>> }

class CocheCorrectoE2 extends VehiculoE2 {
    @Override
    public void conducir() { System.out.println("  Correcto: el coche conduce."); }
}
