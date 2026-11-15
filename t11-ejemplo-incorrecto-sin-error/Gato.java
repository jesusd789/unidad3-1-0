// MALA PRACTICA (compila): la subclase "cumple" el metodo abstracto con un cuerpo vacio.
// El compilador queda satisfecho, pero el gato no hace nada: se rompe el contrato logico.
public class Gato extends Animal {
    @Override
    public void hacerSonido() {
        // vacio a proposito: mala practica
    }
}
