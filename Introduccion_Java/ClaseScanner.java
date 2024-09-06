import java.util.Scanner;

public class ClaseScanner {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in); // Scanner es la clase que permite leer por pantalla
        String nombre;

        System.out.println("Introduzca su nombre");
        nombre = scanner.next();    //Se guarda el texto de la consola en la variable, solo hasta el primer espacio
        System.out.println("Tu nombre es: " + nombre);

        System.out.println("Introduzca su nombre");
        nombre = scanner.nextLine();    //Se guarda el texto de la consola en la variable, la linea entera
        System.out.println("Tu nombre es: " + nombre);

        /*
         * nextInt() Para enteros
         * nextFloat() Para valores con coma
         * nextDouble() Para valores con as decimales
         */
        
         System.out.println("Introduzca un numero");
         int n = scanner.nextInt();

         //PROBLEMA

         n = scanner.nextInt();
         nombre = scanner.nextLine(); // Se lo salta porque guarda el enter de la anterior linea.
         nombre = scanner.nextLine(); // Este si lo coge.

    }
}
