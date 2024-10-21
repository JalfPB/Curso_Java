package Herencia.Ejercicios.Ej6;

public class Ordenador extends ProductoElectronico{

    protected boolean trackpad;

    public Ordenador(float precio, String marca, boolean trackpad) {
        super(precio,marca);
        this.trackpad = trackpad;
    }

    @Override
    public void detalles(){
        System.out.println("Los detalles de este producto son: " + precio + marca + trackpad);
    }

}
