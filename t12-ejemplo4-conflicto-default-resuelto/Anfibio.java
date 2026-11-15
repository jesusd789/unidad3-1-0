// Las dos interfaces tienen default despegar(): Java NO elige por nosotros (problema del diamante).
// Solucion: sobrescribir el metodo y decidir, usando Interfaz.super.metodo()
public class Anfibio implements Volador, Nadador {
    @Override
    public void despegar() {
        Volador.super.despegar(); // se elige la version de Volador
        Nadador.super.despegar(); // o se pueden invocar ambas
    }
}
