public class Moto implements Vehiculo {
    @Override
    public void acelerar() { System.out.println("La moto esta acelerando."); }

    // Se sobrescribe el metodo default con un comportamiento propio
    @Override
    public void encender() { System.out.println("La moto arranca con patada."); }
}
