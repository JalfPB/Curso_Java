package Alamcenamiento_Datos.Ejercicios.Ej1;

import java.io.File;

public class Main {
    /*
     * Crea un método que reciba una carpeta y liste el contenido de dicha carpeta
     * de aquellos archivos cuya extensión sea .txt. Crea una sobrecarga para que el
     * método reciba el tipo de archivo a listar.
     */

    static void listar(String rutaCarpeta) {
        File carpeta = new File(rutaCarpeta);
        String[] listado = carpeta.list();

        if (listado == null || listado.length == 0) {
            System.out.println("No hay elementos dentro de la carpeta actual que sean txt");
            return;
        } else {
            for (int i = 0; i < listado.length; i++) {
                if (listado[i].contains(".txt")) // Comprobacion para que solo muestre los archivos txt
                System.out.println(listado[i]);
            }
        }
    }

    static void listar(String rutaCarpeta, String extension) {
        File carpeta = new File(rutaCarpeta);
        String[] listado = carpeta.list();

        if (listado == null || listado.length == 0) {
            System.out.println("No hay elementos dentro de la carpeta actual que sean txt");
            return;
        } else {
            for (int i = 0; i < listado.length; i++) {
                if (listado[i].contains(extension)) // Comprobacion para que solo muestre los archivos txt
                System.out.println(listado[i]);
            }
        }
    }

    public static void main(String[] args) {

        System.out.println("Archivos .txt:");
        listar("C:\\Users\\Usuario\\Desktop\\Curso_Java\\Alamcenamiento_Datos");
        System.out.println("\nArchivos .java: ");
        listar("C:\\Users\\Usuario\\Desktop\\Curso_Java\\Alamcenamiento_Datos",".java");
    }

}
