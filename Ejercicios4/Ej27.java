package Ejercicios4;
import java.util.Scanner;

public class Ej27 {
    // Crea un simulador de tienda donde el usuario puede comprar productos hasta
    // agotar el inventario.

    public static void main(String[] args) {
        String[] productos = {"Manzanas", "Naranjas", "Platanos", "Peras", "Uvas"};
        int[] inventario = {10, 8, 15, 7, 5}; // Cantidades disponibles en el inventario.
        double[] precios = {0.5, 0.6, 0.3, 0.4, 1.2}; // Precios de cada producto.
        double totalCompra = 0;

        Scanner scanner = new Scanner(System.in);
        boolean continuarComprando = true;

        while (continuarComprando) {
            System.out.println("Bienvenido a la tienda. Estos son nuestros productos disponibles:");

            for (int i = 0; i < productos.length; i++) {
                System.out.println(i + 1 + ". " + productos[i] + " - Precio: " + precios[i] + "€ - Cantidad disponible: " + inventario[i]);
            }

            System.out.println("Elige un número de producto (1-" + productos.length + ") o ingresa 0 para salir:");
            int eleccionProducto = scanner.nextInt();

            if (eleccionProducto == 0) {
                continuarComprando = false;
                break;
            }

            if (eleccionProducto < 1 || eleccionProducto > productos.length) {
                System.out.println("Producto no válido. Inténtalo de nuevo.");
                continue;
            }

            // Ajusta el índice para trabajar correctamente con arrays.
            int indiceProducto = eleccionProducto - 1;

            // Verifica si el producto tiene inventario disponible.
            if (inventario[indiceProducto] == 0) {
                System.out.println("Lo siento, no tenemos mas " + productos[indiceProducto] + " en inventario.");
                continue;
            }

            System.out.println("¿Cuántas unidades de " + productos[indiceProducto] + " deseas comprar?");
            int cantidadCompra = scanner.nextInt();

            if (cantidadCompra <= 0 || cantidadCompra > inventario[indiceProducto]) {
                System.out.println("Cantidad no válida. Solo tenemos " + inventario[indiceProducto] + " unidades disponibles.");
                continue;
            }

            // Actualiza el inventario y calcula el total de la compra.
            inventario[indiceProducto] -= cantidadCompra;
            totalCompra += cantidadCompra * precios[indiceProducto];

            System.out.println("Has comprado " + cantidadCompra + " " + productos[indiceProducto] + "(s).");
            System.out.println("Total actual de tu compra: " + totalCompra + "€");

            // Pregunta si el usuario desea continuar comprando.
            System.out.println("¿Deseas comprar algo más? (S/N)");
            char continuar = scanner.next().toUpperCase().charAt(0);
            if (continuar != 'S') {
                continuarComprando = false;
            }
        }

        System.out.println("Gracias por tu compra. El total a pagar es: " + totalCompra + "€");

    }
}
