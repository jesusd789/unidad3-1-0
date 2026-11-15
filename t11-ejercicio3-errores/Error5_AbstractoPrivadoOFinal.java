/*
 * CASO ERROR 5 - Combinaciones ilegales de modificadores con abstract.
 * Un metodo abstracto debe poder ser sobrescrito, por eso no puede ser private, final ni static.
 * Para ver el error: quita el prefijo "//ERROR>> " de la linea marcada y compila.
 */
public class Error5_AbstractoPrivadoOFinal {
    public static void demostrar() {
        System.out.println("[Error5] abstract + private / final / static");
        new SubE5().operar();
    }
}

abstract class BaseIncorrectaE5 {
    //ERROR>> private abstract void operar();
}

abstract class BaseE5 {
    protected abstract void operar(); // forma correcta: visibilidad que permita sobrescribir
}

class SubE5 extends BaseE5 {
    @Override
    protected void operar() { System.out.println("  Correcto: protected abstract si puede sobrescribirse."); }
}
