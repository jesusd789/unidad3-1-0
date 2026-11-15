public abstract class Empleado {
    protected String nombre;

    public Empleado(String nombre) {
        this.nombre = nombre;
    }

    public abstract void calcularSalario(); // metodo abstracto

    public void mostrarNombre() {           // metodo concreto
        System.out.println("Nombre: " + nombre);
    }
}
