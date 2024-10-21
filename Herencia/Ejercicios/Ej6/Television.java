package Herencia.Ejercicios.Ej6;

public class Television extends ProductoElectronico{

    protected float pulgadas;

    public Television(float precio, String marca, float pulgadas) {
        super(precio,marca);
        this.pulgadas = pulgadas;
    }

    @Override
    public void detalles(){
        System.out.println("Los detalles de este producto son: " + precio + marca + pulgadas);
    }

}
