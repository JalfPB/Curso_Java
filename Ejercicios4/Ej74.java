package Ejercicios4;

public class Ej74 {
    // Implementa un método que a partir del lado, dibuje en cuadrado formado por
    // asteriscos. Crea un método adicional para dibujar dicho cuadrado sin relleno.

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

        dibujarCuadrado(5);
        System.out.println();
        dibujarCuadradoRelleno(5);

    }
}
