/*
 * CASO ERROR 3 - Implementar un metodo de interfaz sin 'public'.
 * Los metodos de una interfaz son public de forma implicita; la clase no puede reducir esa visibilidad.
 * Para ver el error: quita el prefijo "//ERROR>> " de las lineas marcadas y compila.
 */
public class Error3_ReducirVisibilidad {
    public static void demostrar() {
        System.out.println("[Error3] Reducir la visibilidad al implementar una interfaz");
        new SaludoOkE3().saludar();
    }
}

interface SaludadorE3 {
    void saludar();
}

//ERROR>> class SaludoIncorrectoE3 implements SaludadorE3 {
//ERROR>>     @Override
//ERROR>>     void saludar() { System.out.println("hola"); } // sin public
//ERROR>> }

class SaludoOkE3 implements SaludadorE3 {
    @Override
    public void saludar() { System.out.println("  Correcto: el metodo es public."); }
}
