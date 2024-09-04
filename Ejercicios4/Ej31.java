package Ejercicios4;

import java.util.Scanner;

public class Ej31 {
    // Solicita al usuario votos para varios candidatos hasta que se ingrese "fin" y
    // muestra el total de votos para cada candidato.

    public static void main(String[] args) {
        String opcion="";
        int votos1=0, votos2=0, votos3=0;
        Scanner scanner = new Scanner(System.in);


        do{
        System.out.println("CANDIDATO1\n" + //
                            "CANDIDATO2\n" + //
                            "CANDIDATO3\n" + //
                            "Para salir introduzca fin");
        System.out.println("Introduzca su voto");
        System.out.println();

        opcion = scanner.nextLine();

        switch(opcion){
            case "candidato1":
                votos1++;
                System.out.println();
                break;
            case "candidato2":
                votos2++;
                System.out.println();
                break;
            case "candidato3":
                votos3++;
                System.out.println();
                break;
            case "fin":
                System.out.println("Saliendo");
                System.out.println();
                break;
            default:
                System.out.println("Ese candidato no existe");
                System.out.println();
                break;
        }
    }while(!opcion.toLowerCase().equals("fin"));

    System.out.println("El candidato 1 ha conseguido " + votos1 + " votos");
    System.out.println("El candidato 2 ha conseguido " + votos2 + " votos");
    System.out.println("El candidato 3 ha conseguido " + votos3 + " votos");

    }


}
