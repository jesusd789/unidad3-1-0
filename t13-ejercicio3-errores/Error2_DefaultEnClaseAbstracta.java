/*
 * CASO ERROR 2 - Metodos 'default' en una clase abstracta (Ejercicio 3.2).
 * 'default' solo existe en interfaces: sirve para dar una implementacion por defecto sin romper a quienes
 * ya implementan la interfaz. Una clase abstracta ya puede tener metodos concretos normales, por eso
 * 'default' no tiene sentido ni esta permitido en clases.
 * Para ver el error: quita el prefijo "//ERROR>> " de las lineas marcadas y compila.
 */
public class Error2_DefaultEnClaseAbstracta {
    public static void demostrar() {
        System.out.println("[Error2] default dentro de una clase abstracta");
        new AvisoOkE2() { }.avisar();
    }
}

abstract class AvisoIncorrectoE2 {
    //ERROR>> default void avisar() { System.out.println("aviso"); }
}

abstract class AvisoOkE2 {
    public void avisar() { System.out.println("  Correcto: en una clase abstracta basta un metodo concreto normal."); }
}
