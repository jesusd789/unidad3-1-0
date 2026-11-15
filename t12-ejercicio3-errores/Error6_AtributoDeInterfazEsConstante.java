/*
 * CASO ERROR 6 - Los atributos de una interfaz son public static final (constantes).
 * Para ver el error: quita el prefijo "//ERROR>> " de la linea marcada y compila.
 */
public class Error6_AtributoDeInterfazEsConstante {
    public static void demostrar() {
        System.out.println("[Error6] Modificar un atributo de interfaz");
        System.out.println("  Correcto: se LEE la constante, VELOCIDAD_MAX = " + ConfigE6.VELOCIDAD_MAX);
        //ERROR>> ConfigE6.VELOCIDAD_MAX = 200;
    }
}

interface ConfigE6 {
    int VELOCIDAD_MAX = 120; // implicitamente public static final
}
