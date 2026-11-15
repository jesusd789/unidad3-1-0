/*
 * CASO ERROR 1 - La clase concreta no implementa los metodos de la interfaz.
 * Para ver el error: quita el prefijo "//ERROR>> " de las lineas marcadas y compila.
 */
public class Error1_NoImplementaMetodoInterfaz {
    public static void demostrar() {
        System.out.println("[Error1] Clase que implementa una interfaz sin implementar sus metodos");
        new FutbolistaOkE1().jugar();
    }
}

interface JugadorE1 {
    void jugar();
}

//ERROR>> class FutbolistaIncorrectoE1 implements JugadorE1 {
//ERROR>>     // falta implementar jugar()
//ERROR>> }

class FutbolistaOkE1 implements JugadorE1 {
    @Override
    public void jugar() { System.out.println("  Correcto: el futbolista juega."); }
}
