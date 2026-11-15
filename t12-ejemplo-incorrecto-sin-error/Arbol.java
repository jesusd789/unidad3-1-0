// MALA PRACTICA (compila): un Arbol no tiene sentido como Corredor
public class Arbol implements Corredor {
    @Override
    public void correr() {
        System.out.println("Los arboles no pueden correr.");
    }
}
