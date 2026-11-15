/*
 * CASO 6 - MALA PRACTICA que SI compila (Ejercicio 3.2 del taller).
 * Se define un metodo CONCRETO en la clase abstracta que "obliga" a sobrescribir lanzando excepcion.
 * El compilador NO avisa si la subclase olvida sobrescribirlo: el fallo ocurre en ejecucion.
 * Lo correcto es declararlo abstract para que el compilador obligue a implementarlo.
 */
public class Error6_MetodoConcretoQueDebeSobrescribirse {
    public static void demostrar() {
        System.out.println("[Caso6] Metodo concreto que deberia ser abstracto (compila, pero es mala practica)");
        PagoE6 bueno = new PagoTarjetaE6();
        bueno.procesar();
        try {
            new PagoOlvidadoE6().procesar(); // la subclase olvido sobrescribir
        } catch (UnsupportedOperationException e) {
            System.out.println("  Fallo en EJECUCION (no en compilacion): " + e.getMessage());
        }
    }
}

abstract class PagoE6 {
    public void procesar() { // deberia ser: public abstract void procesar();
        throw new UnsupportedOperationException("procesar() no fue sobrescrito");
    }
}

class PagoTarjetaE6 extends PagoE6 {
    @Override
    public void procesar() { System.out.println("  Pago con tarjeta procesado."); }
}

class PagoOlvidadoE6 extends PagoE6 { }
