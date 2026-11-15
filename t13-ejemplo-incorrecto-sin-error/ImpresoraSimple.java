// Solo imprime, pero se ve forzada a "implementar" lo demas lanzando excepciones.
// Compila, pero explota en ejecucion. Solucion: separar en Impresora, Escaner, Fax.
public class ImpresoraSimple implements Maquina {
    @Override
    public void imprimir() { System.out.println("Imprimiendo documento..."); }

    @Override
    public void escanear() { throw new UnsupportedOperationException("Esta impresora no escanea"); }

    @Override
    public void enviarFax() { throw new UnsupportedOperationException("Esta impresora no envia fax"); }
}
