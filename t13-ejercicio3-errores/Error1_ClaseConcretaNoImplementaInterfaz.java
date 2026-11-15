/*
 * CASO ERROR 1 - Clase concreta que implementa una interfaz sin implementar sus metodos (Ejercicio 3.1).
 * Para ver el error: quita el prefijo "//ERROR>> " de las lineas marcadas y compila.
 */
public class Error1_ClaseConcretaNoImplementaInterfaz {
    public static void demostrar() {
        System.out.println("[Error1] Clase concreta sin implementar la interfaz");
        new FutbolistaOkE1().jugar();
    }
}

interface JugadorE1 { void jugar(); }

//ERROR>> class FutbolistaIncorrectoE1 implements JugadorE1 { }

class FutbolistaOkE1 implements JugadorE1 {
    @Override
    public void jugar() { System.out.println("  Correcto: se implementa jugar()."); }
}
