package Polimorfismo.Interfaces.Ejercicios.Ej18;

public class Main {

    public static void main(String[] args) {

        Documento documentoDNI = new Documento(TipoDocumento.DNI);
        Documento documentoPasaporte = new Documento(TipoDocumento.PASAPORTE);
        Documento documentoCarnetConducir = new Documento(TipoDocumento.CARNET_CONDUCIR);

        documentoDNI.getTipoDocumento().imprimir();
        documentoPasaporte.getTipoDocumento().imprimir();
        documentoCarnetConducir.getTipoDocumento().imprimir();

    }

}
