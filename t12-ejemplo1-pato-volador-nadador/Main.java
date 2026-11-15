public class Main {
    public static void main(String[] args) {
        System.out.println("=== Taller 12 - Ejemplo 1: Pato implementa Volador y Nadador ===");
        Pato pato = new Pato();
        pato.volar();
        pato.nadar();

        // Una interfaz es un TIPO: el mismo objeto se ve con distintos "roles"
        Volador v = pato;
        Nadador n = pato;
        v.volar();
        n.nadar();
    }
}
