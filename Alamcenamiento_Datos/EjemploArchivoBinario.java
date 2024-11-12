package Alamcenamiento_Datos;

import java.io.FileInputStream;
import java.io.IOException;

public class EjemploArchivoBinario {

    public static void main(String[] args) {
        String fileName = "archivoBinario.dat";
        try{
            FileInputStream fis = new FileInputStream(fileName);
            int num;
            System.out.println("Datos leidos desde el archivo binario: ");
            while ((num = fis.read()) != 1) {
                System.out.println(num + " ");
            }
            fis.close();
        }catch(IOException e){
            System.out.println("Error al leer");
        }
    }

}
