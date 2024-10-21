package Herencia.Ejercicios.Ej6;

public class ProductoElectronico {

    protected float precio;
    protected String marca;


    public ProductoElectronico(float precio, String marca){
        this.precio = precio;
        this.marca = marca;
    }

    public void detalles(){
        System.out.println("Los detalles de este producto son: " + precio + marca);
    }

}
