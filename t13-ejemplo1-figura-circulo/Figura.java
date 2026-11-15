// Clase abstracta como BASE COMUN: relacion "es-un" + codigo compartido
public abstract class Figura {
    public abstract double calcularArea(); // lo que cambia en cada figura

    public void mostrarFigura() {           // lo que comparten todas las figuras
        System.out.println("Mostrando figura.");
    }
}
