package Datos_Colecciones.Ejercicios.Ej3;

import java.util.LinkedList;
import java.util.Queue;

public class Main {

    public static void main(String[] args) {
        Queue<Cliente> cola = new LinkedList<>();

        // Primer cliente
        cola.add(new Cliente("Alfonso"));

        // Segundo cliente
        cola.add(new Cliente("Alfredo"));
        cola.peek().setTiempoDeAtencion(cola.peek().getTiempoDeAtencion()+1);

        // Tercer cliente
        cola.add(new Cliente("Roberto"));
        cola.peek().setTiempoDeAtencion(cola.peek().getTiempoDeAtencion()+1);

        // Se va el primer cliente
        Cliente c1 = cola.poll();

        // Se empieza a atender al segundo
        cola.peek().setTiempoDeAtencion(cola.peek().getTiempoDeAtencion()+1);
        cola.peek().setTiempoDeAtencion(cola.peek().getTiempoDeAtencion()+1);
        cola.peek().setTiempoDeAtencion(cola.peek().getTiempoDeAtencion()+1);

        // Se va el segundo cliente
        Cliente c2 = cola.poll();

        // Se empieza a atender al tercero
        cola.peek().setTiempoDeAtencion(cola.peek().getTiempoDeAtencion()+1);
        cola.peek().setTiempoDeAtencion(cola.peek().getTiempoDeAtencion()+1);
        cola.peek().setTiempoDeAtencion(cola.peek().getTiempoDeAtencion()+1);

        // Se va el segundo cliente
        Cliente c3 = cola.poll();

        System.out.println("Cliente1: " + c1.getTiempoDeAtencion());
        System.out.println("Cliente2: " + c2.getTiempoDeAtencion());
        System.out.println("Cliente3: " + c3.getTiempoDeAtencion());



    }

}
