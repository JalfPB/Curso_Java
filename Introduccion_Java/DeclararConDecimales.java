public class DeclararConDecimales {

    public static void main(String[] args) {
        float precio = 6.5f;
        int cantidad = 7;
        double descuento = 3.3d;
        float precioTotal = cantidad * precio;
        System.out.println("El precio es: " + precioTotal);
        System.out.println("El descuento es " + (precioTotal*descuento)/100);
        System.out.println("El precio total menos el descuento es " + (precioTotal-(precioTotal*descuento/100)));
    }
}
