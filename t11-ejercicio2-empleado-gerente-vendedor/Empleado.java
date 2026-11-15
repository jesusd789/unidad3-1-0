public abstract class Empleado {
    protected String nombre;

    public Empleado(String nombre) { this.nombre = nombre; }

    // Cada tipo de empleado calcula su salario de forma distinta
    public abstract double calcularSalario();

    // Metodo concreto que utiliza el metodo abstracto
    public void mostrarDetalles() {
        System.out.println("Empleado: " + nombre);
        System.out.println("Cargo: " + getClass().getSimpleName());
        System.out.printf("Salario: $%,.0f%n", calcularSalario());
        System.out.println("--------------------------");
    }
}
