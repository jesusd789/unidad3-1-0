public abstract class Animal {
    protected String nombre;

    public Animal(String nombre) {
        this.nombre = nombre;
    }

    public abstract void hacerSonido();

    public void presentarse() {
        System.out.print(nombre + " dice: ");
        hacerSonido(); // llama a la version de la subclase (polimorfismo)
    }
}
