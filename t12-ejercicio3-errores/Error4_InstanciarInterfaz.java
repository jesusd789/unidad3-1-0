/*
 * CASO ERROR 4 - Intentar instanciar una interfaz con new.
 * Para ver el error: quita el prefijo "//ERROR>> " de la linea marcada y compila.
 */
public class Error4_InstanciarInterfaz {
    public static void demostrar() {
        System.out.println("[Error4] Instanciar una interfaz");
        //ERROR>> VoladorE4 v = new VoladorE4();
        VoladorE4 correcto = new AvionE4(); // forma correcta: instanciar una clase que la implemente
        correcto.volar();
    }
}

interface VoladorE4 { void volar(); }

class AvionE4 implements VoladorE4 {
    @Override
    public void volar() { System.out.println("  Correcto: se instancia la clase AvionE4."); }
}
