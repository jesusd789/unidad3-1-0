public class Coche implements Vehiculo {
    @Override
    public void acelerar() { System.out.println("El coche esta acelerando."); }
    // encender() se hereda de la interfaz sin escribirlo
}
