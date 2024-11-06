package EjerciciosArrays;

public class Ejercicio4 {

    public static void main(String[] args) {
        int[][] calificaciones = {
            {1,2,3,4},
            {1,2,3,4},
            {1,2,3,4}
        };

        for(int i = 0; i<calificaciones.length; i++) {
            int suma = 0;
            for (int j = 0; j < calificaciones[i].length; j++) {
                suma += calificaciones[i][j];
            }
            double promedio = (double) suma / calificaciones[i].length;
            System.out.println("Estudiante " + (i + 1) + ": " + promedio);
        }
    }

}
