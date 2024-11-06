package Datos_Colecciones.Ejercicios2.Ej9;

public class Main {
    /*
     * Crea una aplicación que administre una cola de impresión, donde los
     * documentos se encolan al llegar y se desencolan al ser impresos. Agrega una
     * función de “Prioridad Alta” para los documentos urgentes.
     */

     public static void main(String[] args) {

        ColaImpresion colaImpresion = new ColaImpresion();

        colaImpresion.encolarDocumento("Documento1", false);
        colaImpresion.encolarDocumento("Documento2", true);
        colaImpresion.encolarDocumento("Documento3", false);
        colaImpresion.encolarDocumento("Documento4", true);

        colaImpresion.mostrarCola();

        colaImpresion.imprimirDocumento();
        colaImpresion.imprimirDocumento();
        colaImpresion.imprimirDocumento();
        colaImpresion.imprimirDocumento();

        colaImpresion.imprimirDocumento();
        
     }

}
