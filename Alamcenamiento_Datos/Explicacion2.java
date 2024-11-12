package Alamcenamiento_Datos;

import java.io.File;

public class Explicacion2 {

    public static void main(String[] args) {
        // Crear un objeto File utilizando una cadena que representa la ruta
        File archivo1 = new File("ruta/al/archivo.txt");

        // Crear un objeto File utilizando otro objeto File cpmo base y una cadena
        // que representa el nombre del archivo o directorio
        File directorio = new File("ruta/al/directorio");
        File archivo2 = new File(directorio,"archivo.txt");
    }

}
