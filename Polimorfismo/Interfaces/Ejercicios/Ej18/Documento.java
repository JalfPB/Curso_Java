package Polimorfismo.Interfaces.Ejercicios.Ej18;

public class Documento {
    private TipoDocumento tipoDocumento;

    public Documento(TipoDocumento TipoDocumento) {
        this.tipoDocumento = TipoDocumento;
    }

    public TipoDocumento getTipoDocumento() {
        return tipoDocumento;
    }

    public void setTipoDocumento(TipoDocumento tipoDocumento) {
        this.tipoDocumento = tipoDocumento;
    }

    

}
