public class Main {
    public static void main(String[] args) {
        System.out.println("=== Taller 12 - Ejercicio 3: Implementacion incorrecta de interfaces ===");
        Error1_NoImplementaMetodoInterfaz.demostrar();
        Error2_ConflictoMetodosDefault.demostrar();
        Error3_ReducirVisibilidad.demostrar();
        Error4_InstanciarInterfaz.demostrar();
        Error5_ExtenderDosClases.demostrar();
        Error6_AtributoDeInterfazEsConstante.demostrar();
        System.out.println("Ver t12-ejemplo-incorrecto-sin-error para los casos que compilan pero son mala practica.");
    }
}
