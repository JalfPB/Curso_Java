package Enums;

public class Explicacion {

    public static void main(String[] args) {
        //public enum [nombre] {// posibles valores}

        for (DiaSemana dia : DiaSemana.values()) {
            System.out.println(dia);
        }

        System.out.println(DiaSemana.LUNES.ordinal());
    }

}
