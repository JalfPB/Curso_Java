package EjerciciosRepasoPOO;

import java.util.Scanner;

public class Ej3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion, a, b;
        Racional r = new Racional();
        loop : while(true){ // Nombro al while para romperlo mas tarde
            
            System.out.println("1 - Introduce numero A");
            System.out.println("2 - Introduce numero B");
            System.out.println("3 - Suma de A y B");
            System.out.println("4 - Resta de A y B");
            System.out.println("5 - Multiplicacion de A y B");
            System.out.println("6 - Division de A y B");
            System.out.println("7 - Son iguales A y B");
            System.out.println("8 - Salir");
            opcion = scanner.nextInt();

            switch(opcion){
                case 1:
                    System.out.println("Introduce numerador");
                    a = scanner.nextInt();
                    r.setNumerador(a);
                    break;
                case 2:
                    System.out.println("Introduce denominador");
                    b = scanner.nextInt();
                    r.setDenominador(b);
                    break;
                case 3: 
                System.out.println("Suma: ");
                    System.out.println(r.suma());
                    break;
                case 4:
                System.out.println("Resta: ");
                    System.out.println(r.resta());
                    break;
                case 5:
                    System.out.println("Multiplicacion: ");
                    System.out.println(r.multiplicacion());
                    break;
                case 6:
                System.out.println("Division: ");
                    System.out.println(r.division());
                    break;
                case 7:
                    if(r.iguales()) System.out.println("Son iguales");
                    else System.out.println("No lo son");
                    break;
                case 8:
                    break loop;
                default:
                    System.out.println("Esta opcion no existe");
                

            }
        }
    }

}
