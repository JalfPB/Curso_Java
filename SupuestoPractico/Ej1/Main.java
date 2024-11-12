package SupuestoPractico.Ej1;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Crear un inventario y agregar productos
        Inventario inventario = new Inventario();
        inventario.anadirProducto(new Producto(1, "CocaCola", 2, 5));
        inventario.anadirProducto(new Producto(2, "Pepsi", 2, 5));
        int opcion = 0;
        Scanner scanner = new Scanner(System.in);
        String rutaArchivoTexto = "SupuestoPractico\\Ej1\\inventario.txt";

        // Guardar el inventario en un archivo binario
        String rutaArchivo = "inventario.bin";
        inventario.guardarInventario(rutaArchivo);

        // Cargar el inventario desde el archivo binario
        Inventario inventarioCargado = Inventario.cargarInventario(rutaArchivo);

        // Listar productos del inventario cargado
        if (inventarioCargado != null) {
            inventarioCargado.listarProductos();
        }

        // Guardar el inventario en un archivo de texto
        inventario.guardarInventarioTexto("SupuestoPractico\\Ej1\\inventario.txt");

        // Cargar el inventario desde archivo de texto
        inventario.cargarInventarioTexto("SupuestoPractico\\Ej1\\inventario.txt");

        inventario.listarProductos();

        System.out.println("\nBorrar y deshacer: ");
        inventario.eliminarProducto(1);
        inventario.listarProductos();

        inventario.deshacerEliminacion();
        inventario.listarProductos();

        while (opcion != 9) {
            System.out.println("Elige opcion");
            System.out.println("1 - Añadir Producto");
            System.out.println("2 - Eliminar producto por ID");
            System.out.println("3 - Listar Productos");
            System.out.println("4 - Deshacer Borrado");
            System.out.println("5 - Guardar inventario en archivo de texto");
            System.out.println("6 - Cargar inventario desde archivo de texto");
            System.out.println("7 - Guardar inventario en archivo binario");
            System.out.println("8 - Cargar inventario desde archivo binario");
            System.out.println("9 - Salir");

            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Introduce ID");
                    int id = scanner.nextInt();
                    scanner.nextLine(); // Para limpiar el buffer
                    System.out.println("Introduce Nombre");
                    String nombre = scanner.nextLine();
                    System.out.println("Introduce Precio");
                    double precio = scanner.nextDouble();
                    System.out.println("Introduce Cantidad");
                    int cantidad = scanner.nextInt();
                    inventario.anadirProducto(new Producto(id, nombre, precio, cantidad));
                    break;

                case 2:
                    System.out.println("Introduce ID");
                    id = scanner.nextInt();
                    inventario.eliminarProducto(id);
                    break;

                case 3:
                    inventario.listarProductos();
                    break;

                case 4:
                    inventario.deshacerEliminacion();
                    break;

                case 5:
                    inventario.guardarInventarioTexto(rutaArchivoTexto);
                    break;

                case 6:
                    inventario.cargarInventarioTexto(rutaArchivoTexto);
                    break;

                case 7:
                    inventario.guardarInventario(rutaArchivo);
                    break;

                case 8:
                    inventario = inventario.cargarInventario(rutaArchivo);
                    break;

                case 9:
                    System.out.println("Saliendo del menu");
                    break;
                default:
                    System.out.println("Esta opcion no existe");
                    break;
            }
        }
    }

}
