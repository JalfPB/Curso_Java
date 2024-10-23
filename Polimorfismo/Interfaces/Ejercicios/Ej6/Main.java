package Polimorfismo.Interfaces.Ejercicios.Ej6;

public class Main {

    public static void impresion(Imprimible i){
        i.imprimir();
    }

    public static void main(String[] args) {
        Imagen img = new Imagen();
        Documento doc = new Documento();

        img.imprimir();
        doc.imprimir();

        impresion(doc);

    }

}
