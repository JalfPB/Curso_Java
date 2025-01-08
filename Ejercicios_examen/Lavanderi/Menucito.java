package Lavanderi;

import java.util.Scanner;

public class Menucito {
    public static void menu() {
        Scanner scanner = new Scanner(System.in);
        Lavanderia lavanderia = new Lavanderia();

        // Lógica del menú
        int opcion;
        do {
            System.out.println("1. Agregar Cliente");
            System.out.println("2. Crear Pedido");
            System.out.println("3. Ver Pedidos");
            System.out.println("4. Salir");
            System.out.print("Elige una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine(); // Limpiar buffer

            switch (opcion) {
                case 1:
                    System.out.println("Introduce nombre, teléfono y dirección:");
                    String nombre = scanner.nextLine();
                    String telefono = scanner.nextLine();
                    String direccion = scanner.nextLine();
                    lavanderia.agregarCliente(new Cliente(nombre, telefono, direccion));
                    break;
                case 2:
                    // Lógica para crear pedido
                    break;
                case 3:
                    // Mostrar pedidos
                    break;
            }
        } while (opcion != 4);

        scanner.close();
    }
}