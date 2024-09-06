package Ejercicios2;

import java.util.Scanner;

public class Ej3 {
    public static void main(String[] args) {
        double dado;
        int respuesta;
        boolean repetir = true;
        Scanner scanner = new Scanner(System.in);

        do{
            dado=Math.random()*6+1;
            System.out.println("El dado ha sacado " + (int)dado);
            System.out.println("Repetir tirada? Si: 1 / No: 0");
            respuesta = scanner.nextInt();
            if(respuesta == 0){
                repetir = false;
            }

        }while(repetir);
    }
}
