package Ejercicios4;

public class Ej75 {
    // 75. Implementa un método que a partir de la altura, dibuje un triángulo
    // rectángulo formado por asteriscos. Crea un método adicional para dibujar
    // dicho triángulo sin relleno.

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

    public static void main(String[] args) {

        triangulo(5);
        System.out.println();
        trianguloSinRelleno(5);
        
    }

}
