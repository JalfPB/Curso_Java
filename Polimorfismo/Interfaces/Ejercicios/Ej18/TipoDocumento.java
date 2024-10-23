package Polimorfismo.Interfaces.Ejercicios.Ej18;

public enum TipoDocumento {

    DNI,
    PASAPORTE,
    CARNET_CONDUCIR;

    public void imprimir(){
        System.out.println("El documento es " + this);
    }

}
