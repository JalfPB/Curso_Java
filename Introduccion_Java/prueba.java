import java.util.Scanner;
public class prueba {

    public static void main(String[] args) {
        int x, y, resultado;
        Scanner s = new Scanner(System.in);

        

        System.out.println("Introduce numero 1");
        x = s.nextInt();
        System.out.println("Introduce numero 2");
        y = s.nextInt();

        resultado = x+y;

        System.out.println("El resultado es: " + resultado);
        s.close();
    }

}
