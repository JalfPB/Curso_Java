package Datos_Colecciones.Ejercicios2.Ej3;

import java.util.LinkedList;
import java.util.Queue;

public class Main {
    /*
     * Crea un programa que simule la atención a clientes en un banco, 
     * donde cada cliente se agrega a la cola al llegar y sale de la
     *  cola una vez atendido.
     */

     public static void main(String[] args) {
        Queue colaClientes = new LinkedList<>();

        System.out.println("Llega cliente1");
        colaClientes.add("Cliente1");

        System.out.println("Llega cliente2");
        colaClientes.add("Cliente2");

        System.out.println("Se atiende a cliente 1");
        colaClientes.remove("Cliente1");

        System.out.println("Que cliente va?: " + colaClientes.peek());

        System.out.println("Llega cliente3");
        colaClientes.add("Cliente3");

        System.out.println("Se atiende Cliente 2");
        colaClientes.remove("Cliente2");
        System.out.println("Que cliente va?: " + colaClientes.peek());

        System.out.println("Se atiende Cliente 3");

     }

}
