// extends UNA sola clase (abstracta) + implements VARIAS interfaces
public class Gerente extends Empleado implements Trabajador, Hablador {
    private double bono;

    public Gerente(String nombre, double bono) {
        super(nombre);
        this.bono = bono;
    }

    @Override
    public void calcularSalario() { System.out.println("El salario del gerente incluye un bono de: " + bono); }

    @Override
    public void trabajar() { System.out.println(nombre + " dirige el equipo."); }

    @Override
    public void hablar() { System.out.println(nombre + " habla en la reunion."); }
}
