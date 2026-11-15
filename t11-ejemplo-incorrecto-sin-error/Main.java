public class Main {
    public static void main(String[] args) {
        System.out.println("=== Taller 11 - Ejemplo incorrecto SIN error de compilacion ===");
        System.out.println("Se espera que el gato maulle, pero el metodo esta vacio:");
        Animal gato = new Gato();
        gato.hacerSonido(); // no imprime nada -> comportamiento incorrecto sin ningun error

        System.out.println("(No se vio ningun sonido: el codigo compila y ejecuta, pero la logica esta mal)");
        System.out.println();
        System.out.println("NOTA: el PDF del taller dice que 'Gato extends Animal' SIN sobrescribir compila.");
        System.out.println("En realidad Java da error: 'Gato is not abstract and does not override abstract method'.");
        System.out.println("Ese caso real esta en t11-ejercicio3-errores (Error2).");
    }
}
