package Ejercicios4;

import java.util.Random;
import java.util.Scanner;

public class Ej62 {
    // Diseña un programa para jugar a piedra, papel o tijeras, el programa debe
    // continuar hasta que el usuario escriba salir.

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String opcion, ia="";
        Random randomNumber = new Random();
        int n;

        do {

            n = randomNumber.nextInt(3);
            System.out.println("n es " + n);
            if(n+1==1){
                ia = "piedra";
            }else if(n+1==2){
                ia = "papel";
            }else if(n+1==3){
                ia = "tijeras";
            }

            System.out.println("ia es" + ia);

            System.out.println("Elige piedra papel o tijeras");
            opcion=scanner.nextLine();

            System.out.print("RESULTADO: ");

            switch (opcion.toLowerCase()) {
                case "piedra":
                    if(ia.equals("piedra")){
                        System.out.println("Empate");
                    }else if(ia.equals("papel")){
                        System.out.println("Pierdes");
                    }else if(ia.equals("tijeras")){
                        System.out.println("Ganas");
                    }
                    break;
                case "papel":
                    if(ia.equals("papel")){
                    System.out.println("Empate");
                    }else if(ia.equals("tijeras")){
                        System.out.println("Pierdes");
                    }else if(ia.equals("piedra")){
                        System.out.println("Ganas");
                    }
                    break;
                case "tijeras":
                    if(ia.equals("papel")){
                    System.out.println("Ganas");
                    }else if(ia.equals("tijeras")){
                        System.out.println("Empate");
                    }else if(ia.equals("piedra")){
                        System.out.println("Pierdes");
                    }
                    break;
                case "salir":
                    System.out.println("Saliendo del juego");
                    break;
            
                default:
                    System.out.println("No se reconoce la accion");
                    break;
            }
            System.out.println();
            
        } while (!opcion.toLowerCase().equals("salir"));
    }

}
