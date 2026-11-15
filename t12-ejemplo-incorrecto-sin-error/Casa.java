// MALA PRACTICA (compila): una Casa no se mueve, la interfaz Movible no le corresponde
public class Casa implements Movible {
    @Override
    public void moverse() {
        System.out.println("Las casas no se mueven.");
    }
}
