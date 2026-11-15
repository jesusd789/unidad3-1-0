public class Main {
    public static void main(String[] args) {
        System.out.println("=== Taller 13 - Ejemplos incorrectos SIN error de compilacion ===");

        System.out.println("1) Metodo abstracto 'cumplido' con cuerpo vacio:");
        new Gato().hacerSonido(); // no pasa nada: logica incorrecta sin error

        System.out.println("2) Interfaz demasiado grande:");
        Maquina m = new ImpresoraSimple();
        m.imprimir();
        try {
            m.escanear();
        } catch (UnsupportedOperationException e) {
            System.out.println("   Fallo en ejecucion: " + e.getMessage());
        }
    }
}
