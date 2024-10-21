package Polimorfismo.EjerciciosPolimorfismo.Ej5;

public class Main {

    public static void main(String[] args) {
        Producto[] productos = new Producto[2];
        productos[0] = new Producto("Producto1",1);
        productos[1] = new Producto("Producto1",1);

        if(productos[0].equals(productos[1])) System.out.println("Son iguales");
        else System.out.println("No son iguales");

        productos[0] = new Producto("Producto1",1);
        productos[1] = new Producto("Producto2",1);

        if(productos[0].equals(productos[1])) System.out.println("Son iguales");
        else System.out.println("No son iguales");
    }

}
