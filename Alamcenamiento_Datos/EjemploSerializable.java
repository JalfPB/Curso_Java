package Alamcenamiento_Datos;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Grupo implements Serializable{

}

public class EjemploSerializable {

    public static void main(String[] args) {
        Grupo hola = new Grupo();

        try{
            FileOutputStream fos = new FileOutputStream("archivo.dat");
            ObjectOutputStream out = new ObjectOutputStream(fos);
            out.writeObject(hola);
            out.close();
        }catch(Exception e){
            e.printStackTrace();
        }

        Grupo adios = null;
        try{
            FileInputStream fis = new FileInputStream("archivo.dat");
            ObjectInputStream in = new ObjectInputStream(fis);
            adios = (Grupo) in.readObject();
            in.close();
            fis.close();
        }catch(Exception e){
            System.out.println("Error al crear el objeto");
        }
    }

}
