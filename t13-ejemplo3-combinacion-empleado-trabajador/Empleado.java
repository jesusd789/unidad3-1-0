// Clase abstracta: base comun (atributos, constructor, metodos compartidos)
public abstract class Empleado {
    protected String nombre;

    public Empleado(String nombre) { this.nombre = nombre; }

    public abstract void calcularSalario();

    public void mostrarNombre() { System.out.println("Nombre: " + nombre); }
}
