// Clases NO relacionadas entre si pueden cumplir el mismo contrato
public class Bicicleta implements Vehiculo {
    @Override
    public void acelerar() { System.out.println("La bicicleta acelera pedaleando."); }

    @Override
    public void encender() { System.out.println("La bicicleta no se enciende: se empieza a pedalear."); }
}
