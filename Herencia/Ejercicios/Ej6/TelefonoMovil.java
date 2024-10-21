package Herencia.Ejercicios.Ej6;

public class TelefonoMovil extends ProductoElectronico{

    protected int bateria;

    public TelefonoMovil(float precio, String marca, int bateria) {
        super(precio,marca);
        this.bateria = bateria;
    }

    @Override
    public void detalles(){
        System.out.println("Los detalles de este producto son: " + precio + marca + bateria);
    }

}
