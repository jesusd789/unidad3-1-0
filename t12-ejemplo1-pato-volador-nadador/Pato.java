// Herencia multiple de COMPORTAMIENTO: una clase implementa varias interfaces separadas por coma
public class Pato implements Volador, Nadador {
    @Override
    public void volar() { System.out.println("El pato esta volando."); }

    @Override
    public void nadar() { System.out.println("El pato esta nadando."); }
}
