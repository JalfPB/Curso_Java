package Ejercicios4;
import java.util.Scanner;

public class Ej76 {
    // Crear un menú con 5 opciones, una por cada tipo de figura, y una opción para
    // salir. Se deberá elegir una opción y realizar la acción correspondiente. El
    // programa no terminará hasta que seleccionemos la opción SALIR del menú
    // principal.

    static void triangulo(int lado){
        for(int i = 0;i<=lado; i++){
            for(int j = 0; j<i; j++){
                System.out.print(" * ");
            }
            System.out.println();
        }
    }

    static void trianguloSinRelleno(int lado) {
        for (int i = 1; i <= lado; i++) {
            for (int j = 1; j <= i; j++) {
                // Dibujar el primer y ultimo asterisco de cada fila o toda la base del triangulo
                if (j == 1 || j == i || i == lado) {
                    System.out.print(" * ");
                } else {
                    // Dibujar espacio en blanco en las posiciones intermedias
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
    }

    static void dibujarCuadradoRelleno(int lado) {
        for (int i = 1; i <= lado; i++) {
            if (i == 1 || i == lado) {
                for (int j = 1; j < lado; j++) {
                    System.out.print(" * ");
                }
            } else {
                for (int k = 0; k <= lado - 1; k++) {
                    if (k != 0) {
                        System.out.print(" * ");
                    }
                }
            }
            System.out.println(" * ");
        }

    }

    static void dibujarCuadrado(int lado) {
        for (int i = 1; i <= lado; i++) {
            // Dibujar la primera y última fila completamente
            if (i == 1 || i == lado) {
                for (int j = 1; j <= lado; j++) {
                    System.out.print(" * ");
                }
            } else {
                // Dibujar el borde izquierdo
                System.out.print(" * ");
                // Dibujar los espacios en blanco en el centro
                for (int k = 2; k < lado; k++) {
                    System.out.print("   ");
                }
                System.out.print(" * ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        boolean salir = false;
        String opcion = "";
        Scanner scanner = new Scanner(System.in);

        do{
            System.out.println("1 - Cuadrado " + '\n' + //
                                "2 - Cuadrado sin relleno" + '\n' + //
                                "3 - Triangulo" + '\n' + //
                                "4 - Triangulo sin relleno " + '\n' + //
                                "5 - Salir");

            opcion = scanner.nextLine();

            switch (opcion.toLowerCase()) {
                case "cuadrado":
                        dibujarCuadradoRelleno(5);
                    break;
                case "cuadrado sin relleno":
                    dibujarCuadrado(5);
                    break;
                case "triangulo":
                    triangulo(5);
                    break;
                case "triangulo sin relleno":
                    trianguloSinRelleno(5);
                    break;
                case "salir":
                    System.out.println("Saliendo");
                    salir = true;
                    break;
            
                default:
                    System.out.println("No se reconoce opcion");
                    break;
            }
        }while(!salir);
        
    }

}
