package Ejercicios4;

import java.util.Scanner;

public class Ej5 {

    public static void main(String[] args) {
        //Escribe un programa que lea el índice de masa corporal (IMC) y determine la categoría: bajo peso, normal, sobrepeso u obesidad.
        Scanner scanner = new Scanner(System.in);

        float imc;
        int cat = 0;

        System.out.println("Introduce IMC");
        imc = scanner.nextFloat();

        if(imc<18.5){
            cat = 1;
        }else if(imc>=18.5 && imc<=24.9){
            cat = 2;
        }else if(imc>=25 && imc<=29.9){
            cat = 3;
        }else if(imc>=30){
            cat = 4;
        }

        switch(cat){
            case 1:
                System.out.println("bajo peso");
                break;
            case 2:
                System.out.println("Normal");
                break;
            case 3:
                System.out.println("Sobrepeso");
                break;
            case 4:
                System.out.println("Obesidad");
                break;
        }
    }

}
