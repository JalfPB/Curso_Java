package Polimorfismo.Interfaces.Ejercicios.Ej13;

public enum Meses {

    ENERO,
    FEBRERO,
    MARZO,
    ABRIL,
    MAYO,
    JUNIO,
    JULIO,
    AGOSTO,
    SEPTIEMBRE,
    OCTUBRE,
    NOVIEMBRE,
    DICIEMBRE;

    public boolean esVerano() {
        return this == JUNIO || this == JULIO || this == AGOSTO;
    }
    

}
