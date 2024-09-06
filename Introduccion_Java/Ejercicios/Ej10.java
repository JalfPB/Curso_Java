package Ejercicios;

public class Ej10 {
    //Escribe un programa que calcule el precio final de un producto con IVA.
    public static void main(String[] args) {
        float precio = 10, precioIva;
        int iva = 21;

        precioIva = precio + ((precio*iva)/100);
        System.out.println("El precio con iva es de: " + precioIva);
    }

}
