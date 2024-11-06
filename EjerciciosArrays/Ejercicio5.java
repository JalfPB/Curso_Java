package EjerciciosArrays;

import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio5 {

    public static void main(String[] args) {
        ArrayList<Integer> calificaciones = new ArrayList();
        Scanner scanner = new Scanner(System.in);
        int opcion = 0;

        do{
            System.out.println("1 - Agregar");
            System.out.println("2 - Mostrar");
            System.out.println("3 - Calcular promedio");
            System.out.println("4 - Eliminar calificacion");
            System.out.println("5 - Salir");

            opcion = scanner.nextInt();

            switch(opcion){
                case 1:
                    System.out.println("Introduce calificacion");
                    int n = scanner.nextInt();
                    calificaciones.add(n);
                    break;
                case 2:
                    System.out.println(calificaciones.toString());
                    break;
                case 3:
                    int suma = 0;
                    for(int i = 0; i < calificaciones.size(); i++){
                        suma += calificaciones.get(i);
                    }
                    System.out.println("Promedio: " + (suma/calificaciones.size()));
                    break;
                case 4:
                    System.out.println("Introduce indice de calificacion a eliminar");
                    int indice = scanner.nextInt();
                    calificaciones.remove(indice);
                    break;
                case 5:
                    System.out.println("Saliendo");
                    break;
                default:
                    System.out.println("No existe la opcion");
            }
        }while(opcion != 5);


    }

}
